package Java_Multithreaded_Programming_Core_Technology.part4.方法isFairisHeldByCurrentThread和islocked的测试.test2;

import java.util.concurrent.locks.ReentrantLock;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:30
* @Version:        1.0

*/
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
