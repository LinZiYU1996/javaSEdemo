package Java_Multithreaded_Programming_Core_Technology.Part3.一生产与多消费操作栈解决wait条件改变与假死.stack_2_new_final;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:11 2019/5/22
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
