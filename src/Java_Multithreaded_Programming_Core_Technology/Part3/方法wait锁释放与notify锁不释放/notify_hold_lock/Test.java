package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.notify_hold_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:12 2019/5/22
 */
public class Test {


    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        aThread.start();
        notifyThread.start();
        synNotifyMethodThread.start();
    }


}
