package Practical_Java_high_concurrency_programming.CH3.线程阻塞工具类LockSupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * LockSupport是一个非常方便实用的线程阻塞工具，它可以在线程内任意位置让线程阻塞。与 Thread.suspendO方法相比，它弥补了由千resumeO方法发生导致线程无法继续执行的情况。和 Object.waitO方法相比，它不需要先获得某个对象的锁， 也不会抛出 InterruptedException 异常。
 * LockSupport的静态方法 park()可以阻塞当前线程，类似的还 有parkNanos()、parkUntil() 等方法。 它们实现了 一个限时的等待 。
 *
 *
 * @Date: Create in 19:53 2019/5/29
 */
public class LockSupportDemo {


    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");

    public static class ChangeObjectThread extends Thread {
        public ChangeObjectThread(String name) {
            super.setName(name);
        }


        public void run() {
            synchronized (u) {
                System.out.println("in " + getName());
                LockSupport.park();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(100);
        t2.start();
        LockSupport.unpark(t1);
        LockSupport.unpark(t2);
        t1.join();
        t2.join();
    }



}
