package Java_Multithreaded_Programming_Core_Technology.part4.实扣灶扫节消费者模式多对多交替打印.condition_test_many_to_many;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:19
* @Version:        1.0

*/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionB = lock.newCondition();
    private Condition conditionA = lock.newCondition();
    private boolean hasValue = false;
    public void set() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("有可能★★连续");
                conditionA.await();
            }
            System.out.println("打印★");
            hasValue = true;
            conditionB.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("有可能☆☆连续");
                conditionB.await();
            }
            System.out.println("打印☆");
            hasValue = false;
            conditionA.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
