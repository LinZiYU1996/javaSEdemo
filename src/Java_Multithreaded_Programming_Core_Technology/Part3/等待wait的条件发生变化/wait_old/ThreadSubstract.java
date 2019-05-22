package Java_Multithreaded_Programming_Core_Technology.Part3.等待wait的条件发生变化.wait_old;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:25 2019/5/22
 */
public class ThreadSubstract extends Thread{

    private Substract r;

    public ThreadSubstract(Substract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.substract();
    }


}
