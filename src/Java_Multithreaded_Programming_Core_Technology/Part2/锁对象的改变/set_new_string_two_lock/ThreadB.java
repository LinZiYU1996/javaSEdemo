package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_string_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:27 2019/5/21
 */
public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }


}
