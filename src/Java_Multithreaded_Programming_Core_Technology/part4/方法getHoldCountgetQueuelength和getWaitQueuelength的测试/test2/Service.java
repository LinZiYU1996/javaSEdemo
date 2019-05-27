package Java_Multithreaded_Programming_Core_Technology.part4.方法getHoldCountgetQueuelength和getWaitQueuelength的测试.test2;

import java.util.concurrent.locks.ReentrantLock;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:22
* @Version:        1.0

*/
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " in");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
