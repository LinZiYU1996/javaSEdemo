package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized代码块间的同步性.double_syn_block_one_two;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:04 2019/5/20
 */
public class ThreadB extends Thread{

    private ObjectService service;


    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }


}
