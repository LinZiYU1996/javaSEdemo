package Java_Multithreaded_Programming_Core_Technology.Part3.多个生产者一消费者.stack_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:16 2019/5/22
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
            p.pushService();
        }
    }
}
