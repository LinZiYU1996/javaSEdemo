package Practical_Java_high_concurrency_programming.CH3.锁申请等待限时;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 除了等待外部通知之外，要避免死锁还有另外种方法，那就是限时等待。 依然以
 * 约朋友打球为例，如果朋友迟迟不来，又无法联系到他，那么在等待 l 到 2 个小时后，
 * 我想大部分人都会扫兴离去。 对线程来说也是这样。 通常，我们无法判断为什么
 *
 * 程迟迟拿不到锁。也许是因为死锁了，也许是因为产生了饥饿。如果给定一个等待时间，
 * 让线程自动放弃，那么对系统来说是有意义的。 我们可以使用 tryLock()方法进行
 *
 *
 *
 *
 * @Date: Create in 15:03 2019/5/29
 */
public class TimeLock implements Runnable{

    public static ReentrantLock lock = new ReentrantLock();

    public void run() {
        try {
            if (lock.tryLock(5, TimeUnit.SECONDS)) {
                //在这里，tryLock()方法接收两个参数，一个表示等待时长，另外 个表示计时单位。 这
                //里的单位设置为秒，时长为 5, 表示线程在这个锁请求中最多等待 5 秒。如果超过 5 秒还没
                //有得到锁，就会返回false。如果成功获得锁，则返回true。


                Thread.sleep(6000);
            } else {
                System.out.println("Get lock failed");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(lock.isHeldByCurrentThread())
                lock.unlock();
        }
    }

    public static void main(String [] args){
        TimeLock lock1 = new TimeLock();
        Thread t1 = new Thread(lock1);
        Thread t2 = new Thread(lock1);
        t1.start();
        t2.start();
    }


}
