package Java_Multithreaded_Programming_Core_Technology.Part3.只通知一个线程.notify_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:13 2019/5/22
 */
public class NotifyThread extends Thread{

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();

            //lock.notifyAll();
        }
    }


}
