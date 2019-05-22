package Java_Multithreaded_Programming_Core_Technology.Part3.只通知一个线程.notify_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:14 2019/5/22
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
