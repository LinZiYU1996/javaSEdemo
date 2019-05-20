package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:28 2019/5/20
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }


}
