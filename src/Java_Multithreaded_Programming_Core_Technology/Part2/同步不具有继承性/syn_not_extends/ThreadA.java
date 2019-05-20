package Java_Multithreaded_Programming_Core_Technology.Part2.同步不具有继承性.syn_not_extends;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:42 2019/5/20
 */
public class ThreadA extends Thread{

    private Sub sub;

    public ThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }


}
