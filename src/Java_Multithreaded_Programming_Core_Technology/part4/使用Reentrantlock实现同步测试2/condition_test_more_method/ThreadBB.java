package Java_Multithreaded_Programming_Core_Technology.part4.使用Reentrantlock实现同步测试2.condition_test_more_method;




/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:48
* @Version:        1.0

*/
public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}
