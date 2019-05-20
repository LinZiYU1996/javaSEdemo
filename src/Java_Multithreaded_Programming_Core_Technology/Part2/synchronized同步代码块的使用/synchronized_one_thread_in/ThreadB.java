package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized同步代码块的使用.synchronized_one_thread_in;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:51 2019/5/20
 */
public class ThreadB extends Thread{

    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }


}
