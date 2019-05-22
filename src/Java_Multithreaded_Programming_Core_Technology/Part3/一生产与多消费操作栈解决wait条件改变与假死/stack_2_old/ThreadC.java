package Java_Multithreaded_Programming_Core_Technology.Part3.一生产与多消费操作栈解决wait条件改变与假死.stack_2_old;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2019/5/22
 */
public class ThreadC extends Thread{

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.popService();
        }
    }



}
