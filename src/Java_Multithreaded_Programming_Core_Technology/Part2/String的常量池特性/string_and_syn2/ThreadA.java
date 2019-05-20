package Java_Multithreaded_Programming_Core_Technology.Part2.String的常量池特性.string_and_syn2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:21 2019/5/20
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        Service.print(new Object());
    }


}
