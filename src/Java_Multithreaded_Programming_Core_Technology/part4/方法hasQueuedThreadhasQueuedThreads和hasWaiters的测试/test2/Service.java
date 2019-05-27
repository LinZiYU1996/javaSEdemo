package Java_Multithreaded_Programming_Core_Technology.part4.方法hasQueuedThreadhasQueuedThreads和hasWaiters的测试.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:36
* @Version:        1.0

*/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有没有线程正在等待newCondition? " + lock.hasWaiters(newCondition) + " 线程数是多少？ " + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
