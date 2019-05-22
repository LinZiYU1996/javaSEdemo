package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.notify_hold_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:12 2019/5/22
 */
public class ThreadA extends Thread{

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }


}
