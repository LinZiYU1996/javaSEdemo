package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作栈.stack_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:20 2019/5/22
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
