package Java_Multithreaded_Programming_Core_Technology.Part2.出现异常锁自动释放.throw_exception_no_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:41 2019/5/20
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }


}
