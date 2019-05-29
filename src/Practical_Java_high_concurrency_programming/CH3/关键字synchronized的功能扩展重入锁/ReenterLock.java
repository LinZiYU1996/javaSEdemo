package Practical_Java_high_concurrency_programming.CH3.关键字synchronized的功能扩展重入锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * ，与关键字synchronized 相比，重入锁有着显示的操作过程。开发入员必须手动指定何时加锁，
 * 何时释放锁。 也正因为这样， 重入锁对逻辑控制的灵活性要远远优于关键字synchronized。但值得注意的是，
 * 在退出临界区时，必须记得释放锁（代码第11行），否则， 其他线程就没有机会再访问临界区了。
 * 一个线程连续两次获得同一把锁是允许的。 如果不允许这么操作， 那么 个线程在第2次获得锁时， 将会和自己产生死锁。 程序就会 “ 卡死 ” 在第2次申请锁的
 *如果同一个线程多次获得锁， 那么在释放锁的时候， 也必须释放相同次数。 如果释放锁的次数多了， 那么会得到一个java. lang.IllegalMonitorStateException异 常， 反之，如果释放锁的次数少了， 那么相当于线程还持有这个锁，因此， 其他线程也无法进入临界区。
 *
 *
 *
 *
 *
 * @Date: Create in 11:20 2019/5/29
 */
public class ReenterLock implements Runnable{


    public static ReentrantLock lock = new ReentrantLock();
    public static int i=0;

    public void run() {
        for(int j=0;j<10000000;j++){
            lock.lock();
//            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
//                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock r1 = new ReenterLock();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }




}
