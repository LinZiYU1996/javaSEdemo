package Practical_Java_high_concurrency_programming.CH3.锁申请等待限时;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * ReentrantLock. try Lock()方法也可以不带参数直接运行。 在这种情况下，
 * 当前线程会尝试获得锁， 如果锁并未被其他线程占用， 则申请锁会成功， 并立即返回true。 如果锁被其他 线程占用，
 * 则当前线程不会进行等待， 而是立即返回 false。这种模式不会引起线程等待， 因此也不会产生死锁。 下面演示了这种使用方式：
 *
 *
 * @Date: Create in 15:05 2019/5/29
 */
public class TryLock implements Runnable{

    // 这里书中没有提到，这儿使用static，所以创建两个TryLock对象才会共用lock1和lock2
    // 如果没有static会很快结束程序，因为使用的是自己的lock1和lock2不会互相锁住
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();
    int lock;

    public TryLock(int lock) {
        this.lock = lock;
    }


    public void run() {
        if (lock == 1) {
            while (true) {
                if(lock1.tryLock()){
                    try {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (lock2.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getId() + " my job done");
                                return;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    }finally {
                        lock1.unlock();
                    }
                }
            }
        } else {
            while (true) {
                if(lock2.tryLock()){
                    try {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (lock1.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getId() + " my job done");
                                return;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    }finally {
                        lock2.unlock();
                    }
                }
            }
        }
    }

    public static void main(String [] args){
        TryLock lock1 = new TryLock(1);
        TryLock lock2 = new TryLock(2);
        Thread t1 = new Thread(lock1);
        Thread t2 = new Thread(lock2);
        t1.start();
        t2.start();

        //上述代码采用了非常容易死锁的加锁顺序。也就是先让t1获得lockl,再让t2获得lock2,

        //一
        //接着做反向请求， 让 tl 申请 lock2, t2 申请 lockl 。在

        //般情况下， 这会导致 tl 和 t2 相互等

        //待， 从而引起死锁。
        //但是使用 tryLock()方法后， 这种情况就大大改善了。 由千线程不会傻傻地等待， 而是不停地尝试，
        // 因此， 只要执行足够长的时间， 线程总是会得到所有需要的资源， 从而正常执行（这里以线程同时获得 lockl 和 lock2 两把锁，
        // 作为其可以正常执行的条件）。 在同时获得 lockl 和 lock2 后， 线程就打印出标志着任务完成的信息"My Job done"




    }


}
