package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作值假死.p_c_all_wait;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:38 2019/5/22
 */
public class ThreadCu extends Thread{

    private C c;

    public ThreadCu(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.getValue();
        }

    }
}
