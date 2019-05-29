package Practical_Java_high_concurrency_programming.CH3.ReadWritelock读写锁;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * •	读－读不互斥： 读读之间不阻塞。
 * •	读写互斥： 读阻塞写， 写也会阻塞读。
 * •	写写互斥： 写写阻塞。
 *
 * 用锁分离的机制来提升性能非常容易理解， 比如线程Al、 A2、 A3进行写操作， Bl、 B2、 B3进行读操作， 如果使用重入锁或者内部锁，
 * 从理论上说所有读之间、 读与写之间、 写和写之间都是串行操作。 当Bl 进行读取时， B2、 B3则需要等待锁。 由于读 操作并不对数据的完整性造成破坏
 * ， 这种等待显然是不合理的。 因此， 读写锁就有了发挥功能的余地。
 * 在这种情况下， 读写锁允许多个线程同时读， 使得Bl、 B2、 B3之间真正并行。 但是，考虑到数据完整性， 写写操作和读写操作间依然是需
 * 要相互等待和待有锁的。
 *
 *
 *
 *
 * @Date: Create in 16:39 2019/5/29
 */
public class ReadWriteLockDemo {

    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();
    private static Lock writeLock = readWriteLock.writeLock();
    private int value;


    //／／模拟读操作
    //／／读操作的耗时越多，读写锁的优势就越明显
    public Object handleRead(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
            System.out.println("read success");
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void handleWrite(Lock lock, int index) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
            value = index;
            System.out.println("write success");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        Runnable readRunnable = new Runnable() {
            public void run() {
                try {
//                    demo.handleRead(readLock);
                    demo.handleRead(lock);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable writeRunnable = new Runnable() {

            public void run() {
                try {
//                    demo.handleWrite(writeLock, new Random().nextInt());
                    demo.handleWrite(lock, new Random().nextInt());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 18; i++) {
            new Thread(readRunnable).start();
        }

        for (int i = 18; i < 20; i++) {
            new Thread(writeRunnable).start();
        }
    }



}
