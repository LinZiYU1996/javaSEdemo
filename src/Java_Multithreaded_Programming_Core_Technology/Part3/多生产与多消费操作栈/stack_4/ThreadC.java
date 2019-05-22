package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作栈.stack_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:19 2019/5/22
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
