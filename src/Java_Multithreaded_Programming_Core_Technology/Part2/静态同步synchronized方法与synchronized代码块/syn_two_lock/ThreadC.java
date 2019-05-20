package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:00 2019/5/20
 */
public class ThreadC extends Thread{


    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }


}
