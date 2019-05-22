package Java_Multithreaded_Programming_Core_Technology.Part3.生产者消费者模式实现.p_r_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2019/5/22
 */
public class ThreadP extends Thread{

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            p.setValue();
        }
    }

}
