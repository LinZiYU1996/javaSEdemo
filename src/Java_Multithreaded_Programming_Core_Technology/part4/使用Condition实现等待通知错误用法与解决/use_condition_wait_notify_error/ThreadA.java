package Java_Multithreaded_Programming_Core_Technology.part4.使用Condition实现等待通知错误用法与解决.use_condition_wait_notify_error;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:52
* @Version:        1.0

*/
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.await();
    }
}
