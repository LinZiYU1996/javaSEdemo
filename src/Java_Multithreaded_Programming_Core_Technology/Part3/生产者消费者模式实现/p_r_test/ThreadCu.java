package Java_Multithreaded_Programming_Core_Technology.Part3.生产者消费者模式实现.p_r_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:32 2019/5/22
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
