package Java_Multithreaded_Programming_Core_Technology.part4.方法isFairisHeldByCurrentThread和islocked的测试.test1;

import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:29
* @Version:        1.0

*/
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁的情况： " + lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
