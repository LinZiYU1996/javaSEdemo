package Java_Multithreaded_Programming_Core_Technology.part4.方法getHoldCountgetQueuelength和getWaitQueuelength的测试.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:24
* @Version:        1.0

*/
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            newCondition.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有 " + lock.getWaitQueueLength(newCondition) + " 个线程正在等待newCondition");
            newCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
