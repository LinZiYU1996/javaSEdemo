package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_block_string2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:25 2019/5/20
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.b();
    }


}
