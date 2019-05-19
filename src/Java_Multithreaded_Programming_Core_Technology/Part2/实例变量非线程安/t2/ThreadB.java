package Java_Multithreaded_Programming_Core_Technology.Part2.实例变量非线程安.t2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:56 2019/5/19
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
