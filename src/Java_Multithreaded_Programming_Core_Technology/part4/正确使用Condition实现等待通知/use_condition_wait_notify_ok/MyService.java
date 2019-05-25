package Java_Multithreaded_Programming_Core_Technology.part4.正确使用Condition实现等待通知.use_condition_wait_notify_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:10
* @Version:        1.0

*/
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void await() {
        try {
            lock.lock();
            System.out.println("await time = " + System.currentTimeMillis());
            condition.await();
            System.out.println("after await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal time = " + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
