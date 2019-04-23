package Thread.lock_demo;

import java.util.concurrent.locks.ReentrantLock;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 20:41 2019/4/23
 **/
public class ReenterLock implements Runnable{

    public static ReentrantLock reentrantLock = new ReentrantLock();

    public static int anInt = 0;

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            reentrantLock.lock();
            try {
                anInt++;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock reenterLock = new ReenterLock();
        Thread thread1 = new Thread(reenterLock);
        Thread thread2 = new Thread(reenterLock);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(anInt);


        //重入锁
        //指这种锁可以反复进入，但是仅仅局限于一个线程
        //如
        //lock.lock();
        //lock.lock();
        //try
        //i++;
        //lock.unlock();
        //lock.unlock();

        //上面一个线程可以连续两次获取同一把锁是允许的，不允许就会产生死锁


    }
}
