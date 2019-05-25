package Java_Multithreaded_Programming_Core_Technology.part4.使用多个Condition实现通知部分线程错误用法.must_use_more_condition_error;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:13
* @Version:        1.0

*/
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.awaitB();
    }
}
