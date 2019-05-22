package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait的使用.wait_has_param_method;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:18 2019/5/22
 */
public class MyRunnable {

    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    /**
                     * 等待5s如果没有被其他线程唤醒，超过时间则自动唤醒
                     */
                    lock.wait(5000);
                    System.out.println("wait   end timer = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
    }


}
