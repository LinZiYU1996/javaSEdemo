package Practical_Java_high_concurrency_programming.CH3.中断响应;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 * 产生一个死锁， 但得益千锁中断， 我们可以很轻易地解决这个死锁。
 *
 *
 * @Date: Create in 14:56 2019/5/29
 */
public class IntLock implements Runnable{


    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();
    int lock;

    public IntLock(int lock) {
        this.lock = lock;
    }


    public void run() {
        try {
            if (this.lock == 1) {
                lock1.lockInterruptibly();
                Thread.sleep(500);
                lock2.lockInterruptibly();
            } else {
                lock2.lockInterruptibly();
                Thread.sleep(500);
                lock1.lockInterruptibly();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread())
                lock1.unlock();
            if (lock2.isHeldByCurrentThread())
                lock2.unlock();
            System.out.println(this.lock + "线程退出");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //线程tl和t2启动后， tl先占用lockl, 再占用lock2; t2先占用lock2, 再请求lockl。

        //因此，很容易形成tl和t2之间的相互等待。在这里，对锁的请求，统

        //使用locklterruptibly()

        //个可以对中断进行响应的锁 申请动作 ， 即在等待锁的过程中， 可以响应中断。


        IntLock r1 = new IntLock(1);
        IntLock r2 = new IntLock(2);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        t2.interrupt();//中断其中一个线程
        //由于t2线程被中断， 故t2会放弃对lockl的申请， 同时释放已获得的lock2。这个操作导致tl线程可以顺利得到lock2而继续执行下去。


    }


}
