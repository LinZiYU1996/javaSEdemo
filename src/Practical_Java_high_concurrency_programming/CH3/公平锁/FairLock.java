package Practical_Java_high_concurrency_programming.CH3.公平锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在大多数情况下， 锁的申请都是非公平的。 也就是说， 线程l首先请求了锁A, 接着线程2也请求了锁A。
 * 那么当锁A可用时，是线程l可以获得锁还是线程2可以获得锁呢？
 *
 *一 一
 * 这是不 定的， 系统只是会从这个锁的等待队列中随机挑选   因此不能保证其公平性。
 *
 * 这就好比买票不排队， 大家都围在售票窗口前， 售票员忙得焦头烂额， 也顾不及谁先谁后，随便找个人出票就完事了。 而公平的锁， 则不是这样， 它会按照时间的先后顺序， 保证先
 *
 * 到者先得， 后到者后得。 公平锁的 大特点是： 它不会产生饥饿现象。 只要你排队， 最终还是可以等到资源的。如果我们使用 synchronized 关键字进行锁控制， 那么产生的锁就是非 公平的。 而重入锁允许我们对其公平性进行设置。
 *
 *
 *
 *
 * @Date: Create in 15:10 2019/5/29
 */
public class FairLock implements Runnable{


    //当参数fair为true时， 表示锁是公平的。公平锁看起来很优美， 但是要实现公平锁必然

    //一
    //要求系统维护 个有序队列， 因此公平锁的实现成本比较高， 性能却非常低下， 因此， 在默
    //认情况下， 锁是非公平的。 如果没有特别的需求， 则不需要使用公平锁。 公平锁和非公平锁
    //一


    public static ReentrantLock fairLock = new ReentrantLock(true);
//    public static ReentrantLock fairLock = new ReentrantLock();

    public void run() {
        while (true){
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getName());
            }finally {
                fairLock.unlock();
            }
        }
    }

    public static void main(String [] args){
        FairLock r1 = new FairLock();
        Thread t1 = new Thread(r1,"Thread_t1");
        Thread t2 = new Thread(r1,"Thread_t2");
        t1.start();
        t2.start();
    }


}
