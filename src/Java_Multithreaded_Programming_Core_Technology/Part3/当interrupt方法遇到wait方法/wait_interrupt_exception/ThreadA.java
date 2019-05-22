package Java_Multithreaded_Programming_Core_Technology.Part3.当interrupt方法遇到wait方法.wait_interrupt_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:09 2019/5/22
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
