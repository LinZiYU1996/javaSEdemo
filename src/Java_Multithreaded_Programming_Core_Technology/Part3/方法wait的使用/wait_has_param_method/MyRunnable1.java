package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait的使用.wait_has_param_method;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:18 2019/5/22
 */
public class MyRunnable1 {

    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {

            synchronized (lock) {
                System.out.println("notify begin timer = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end timer = " + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(runnable1);
        t1.start();
        Thread t2 = new Thread(runnable2);
        t2.start();
    }


}
