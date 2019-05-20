package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_more_object_static_one_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:09 2019/5/20
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }


}
