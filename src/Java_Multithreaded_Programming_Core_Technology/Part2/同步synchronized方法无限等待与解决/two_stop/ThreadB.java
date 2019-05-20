package Java_Multithreaded_Programming_Core_Technology.Part2.同步synchronized方法无限等待与解决.two_stop;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:25 2019/5/20
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }


}
