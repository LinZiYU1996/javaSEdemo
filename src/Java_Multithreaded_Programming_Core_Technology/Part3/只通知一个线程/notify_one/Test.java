package Java_Multithreaded_Programming_Core_Technology.Part3.只通知一个线程.notify_one;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:13 2019/5/22
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 一个notify仅随机唤醒一个线程
         *
         * notify调用多少次就唤醒多少对应wait的线程，多的自动忽略
         *
         * 唤醒所有  直接notifyAll()
         */
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        ThreadB bThread = new ThreadB(lock);
        ThreadC cThread = new ThreadC(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        aThread.start();
        bThread.start();
        cThread.start();
        Thread.sleep(1000);
        notifyThread.start();
    }


}
