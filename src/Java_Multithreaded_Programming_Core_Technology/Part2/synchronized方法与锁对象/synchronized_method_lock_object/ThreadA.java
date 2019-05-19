package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法与锁对象.synchronized_method_lock_object;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:12 2019/5/19
 */
public class ThreadA extends Thread{

    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }


}
