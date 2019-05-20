package Java_Multithreaded_Programming_Core_Technology.Part2.String的常量池特性.string_and_syn;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:18 2019/5/20
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        super.run();
        Service.print("AA");
    }


}
