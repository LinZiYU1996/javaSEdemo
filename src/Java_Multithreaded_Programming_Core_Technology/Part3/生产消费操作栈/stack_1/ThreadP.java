package Java_Multithreaded_Programming_Core_Technology.Part3.生产消费操作栈.stack_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2019/5/22
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
