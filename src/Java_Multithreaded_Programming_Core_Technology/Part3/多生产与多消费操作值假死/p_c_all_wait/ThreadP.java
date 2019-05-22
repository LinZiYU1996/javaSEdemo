package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作值假死.p_c_all_wait;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:39 2019/5/22
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
