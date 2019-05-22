package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.notify_hold_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:11 2019/5/22
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() thread name " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() thread name" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() thread name " + Thread.currentThread().getName());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("  end notify() thread name " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
