package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.wait_release_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:08 2019/5/22
 */
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }


}
