package Java_Multithreaded_Programming_Core_Technology.part4.使用多个Condition实现通知部分线程错误用法.must_use_more_condition_error;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:13
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /**
         * A B 线程 都会被唤醒
         */
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
