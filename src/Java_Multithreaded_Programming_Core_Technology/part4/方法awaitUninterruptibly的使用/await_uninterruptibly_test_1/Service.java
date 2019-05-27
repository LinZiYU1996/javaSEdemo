package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUninterruptibly的使用.await_uninterruptibly_test_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;





/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:48
* @Version:        1.0

*/
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait   end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }

    }
}
