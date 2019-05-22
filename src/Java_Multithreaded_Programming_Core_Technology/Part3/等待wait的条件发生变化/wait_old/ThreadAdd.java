package Java_Multithreaded_Programming_Core_Technology.Part3.等待wait的条件发生变化.wait_old;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:25 2019/5/22
 */
public class ThreadAdd extends Thread{

    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }


}
