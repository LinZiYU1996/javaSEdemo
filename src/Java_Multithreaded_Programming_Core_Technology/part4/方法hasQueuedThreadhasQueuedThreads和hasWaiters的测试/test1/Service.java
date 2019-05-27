package Java_Multithreaded_Programming_Core_Technology.part4.方法hasQueuedThreadhasQueuedThreads和hasWaiters的测试.test1;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:35
* @Version:        1.0

*/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
