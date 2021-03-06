package Java_Multithreaded_Programming_Core_Technology.Part3.只通知一个线程.notify_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:13 2019/5/22
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() thread name " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() thread name " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
