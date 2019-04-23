package Thread.basic_demo;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * JAVA提倡通过协作的方式结束线程，而不是使用强制停止的方式进行结束线程如stop()，resume(),suspend()已不建议使用，
 * stop()会导致线程不会正确释放资源，suspend()容易导致死锁。那么怎样协同的方式结束线程呢？
 * 就是同过Thread的interrupt()方法进行协作中断线程。而调用interrupt方法是在线程中设置一个中断的标志位，
 * 中断标志默认为false。被中断的线程通过循环的方式监听这个标志位确定当前线程需要中断。


 * @Date 19:59 2019/4/23
 **/
public class Testinterrupt {


    public static class SafeThread implements Runnable{


        @Override
        public void run() {
            System.out.println("flag = "+Thread.currentThread().isInterrupted());
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName()+"running");
            }
            System.out.println(Thread.currentThread().getName()+"is end ,flag = "+Thread.currentThread().isInterrupted());
        }
    }



    //在进行协作处理线程结束的时候清除标志位。在我们的被中断的线程中如果使用到了sleep方法时，如果中断线程调用时，该线程处于sleep时，
    // 会抛出InterruptedException，如果使用进行try/catch捕捉该异常的时候会清除标志位。
    // 所以我们需要再调用被中断的线程的    interrupt()方法。

    public static class SafeThreadTwo implements Runnable{

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName()+"running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                    System.out.println("flag = "+Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName()+"is end ,flag = "+Thread.currentThread().isInterrupted());
        }

    }

    public static void main(String[] args) throws InterruptedException {
//            SafeThread safeThread = new SafeThread();
//            Thread thread = new Thread(safeThread);
//            thread.start();
//            Thread.sleep(1000);
//            thread.interrupt();


        SafeThreadTwo safeThreadTwo = new SafeThreadTwo();
        Thread thread = new Thread(safeThreadTwo);
        thread.start();
        Thread.sleep(3);
        thread.interrupt();


    }
}
