package Java_Multithreaded_Programming_Core_Technology.Part2.方法内的变量为线程安全.t1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:44 2019/5/19
 */
public class ThreadB extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }


}
