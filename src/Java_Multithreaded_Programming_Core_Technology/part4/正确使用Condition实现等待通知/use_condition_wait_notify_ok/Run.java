package Java_Multithreaded_Programming_Core_Technology.part4.正确使用Condition实现等待通知.use_condition_wait_notify_ok;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:56
* @Version:        1.0

*/
public class Run {



    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
