package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_static_method;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:55 2019/5/20
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        super.run();
        Service.printB();
    }


}
