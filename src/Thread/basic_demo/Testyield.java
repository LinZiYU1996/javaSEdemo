package Thread.basic_demo;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *vyield的主要作用的是让出CPU的执行时间，需要注意的时候，
 * 调用yield虽然让出了CPU的执行时间，但是会参与下一次的CPU执行时间的竞争中，如果当前线程重新获得CPU执行时间，那么当前的线程再次执行
 * @Date 20:05 2019/4/23
 **/
public class Testyield {

    public static class ThreadYieldRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+"running"+i);
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        ThreadYieldRunnable threadYieldRunnable= new ThreadYieldRunnable();
        Thread t1 = new Thread(threadYieldRunnable);
        t1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1.yield");
    }
}
