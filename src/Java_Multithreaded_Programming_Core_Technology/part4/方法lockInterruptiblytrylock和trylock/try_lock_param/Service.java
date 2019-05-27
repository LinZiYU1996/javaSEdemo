package Java_Multithreaded_Programming_Core_Technology.part4.方法lockInterruptiblytrylock和trylock.try_lock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:44
* @Version:        1.0

*/
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            //如果3秒没有锁没有被其他线程保持，并且当前线程没有中断就或得锁定
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName()
                        + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName()
                        + "没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
