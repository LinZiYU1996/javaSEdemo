package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUntil的使用.await_until_test;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:53
* @Version:        1.0

*/
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("wait begin timer=" + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out
                    .println("wait   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void notifyMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("notify begin timer=" + System.currentTimeMillis());
            condition.signalAll();
            System.out
                    .println("notify   end timer=" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }

    }
}
