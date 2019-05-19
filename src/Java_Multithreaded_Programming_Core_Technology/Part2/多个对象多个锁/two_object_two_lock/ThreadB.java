package Java_Multithreaded_Programming_Core_Technology.Part2.多个对象多个锁.two_object_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:02 2019/5/19
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
