package Java_Multithreaded_Programming_Core_Technology.part4.公平锁与非公平锁.fair_onfair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:15
* @Version:        1.0

*/
public class Service {
    private Lock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " get locked");
        }finally {
            lock.unlock();
        }
    }
}
