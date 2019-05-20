package Java_Multithreaded_Programming_Core_Technology.Part2.出现异常锁自动释放.throw_exception_no_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:42 2019/5/20
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }


}
