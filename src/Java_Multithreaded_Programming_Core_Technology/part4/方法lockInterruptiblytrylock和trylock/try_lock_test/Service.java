package Java_Multithreaded_Programming_Core_Technology.part4.方法lockInterruptiblytrylock和trylock.try_lock_test;

import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:42
* @Version:        1.0

*/
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
