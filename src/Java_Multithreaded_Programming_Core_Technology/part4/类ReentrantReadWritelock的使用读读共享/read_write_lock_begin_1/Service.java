package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用读读共享.read_write_lock_begin_1;

import java.util.concurrent.locks.ReentrantReadWriteLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 16:05
* @Version:        1.0

*/


public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName()
                        + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
