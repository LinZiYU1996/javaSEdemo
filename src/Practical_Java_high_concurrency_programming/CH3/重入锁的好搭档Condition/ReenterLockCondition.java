package Practical_Java_high_concurrency_programming.CH3.重入锁的好搭档Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:28 2019/5/29
 */
public class ReenterLockCondition implements Runnable{

    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    public void run() {
        try{
            lock.lock();
            condition.await();
            //•	await()方法会使当前线程等待， 同时释放当前锁， 当其他线程中使用 signal()方法或者 signalAll()方法时， 线程会重新获得锁并继续执行。 或者当线程被中断时， 也能跳出等待。 这和 Object.wait()方法相似。


            System.out.println("Thread is going on");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String [] args) throws InterruptedException {
        ReenterLockCondition r1 = new ReenterLockCondition();
        Thread t1= new Thread(r1);
        t1.start();
        Thread.sleep(2000);
        lock.lock();
        condition.signal();

        //与 Object.wait()方法和 notify()方法一样，当线程使用 Condition.awaitQ方法时，
        // 要求线程持有相关的重入锁， 在 Condition.await()方法调用后， 这个线程会释放这把锁。
        // 同理， 在 Condi ti on. signal()方法调用时， 也要求线程先获得相关的锁。 在 signal()方法调用后，
        // 系统会从当前 Condition 对象的等待队列中唤醒一个线程。一旦线程被唤醒， 它会重新尝试获得与之绑定的重入锁，
        // 一旦成功获取， 就可以继续执行了。 因此， 在 signal()方法调用之后， 一 般需要释放相关的锁， 让给被唤醒的线程， 让它可以继续执行。


        lock.unlock();
    }


}
