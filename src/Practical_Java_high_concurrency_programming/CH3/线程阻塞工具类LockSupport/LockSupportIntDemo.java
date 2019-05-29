package Practical_Java_high_concurrency_programming.CH3.线程阻塞工具类LockSupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 除了有定时阻塞的功能， LockSupport.park()方法还能支持中断影响。
 *
 *
 * @Date: Create in 19:56 2019/5/29
 */
public class LockSupportIntDemo {


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
                if (Thread.interrupted()) {
                    System.out.println(getName() + "被中断了");
                }
            }
            System.out.println(getName() + "执行结束");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(100);
        t2.start();
        t1.interrupt();
        LockSupport.unpark(t2);
    }



}
