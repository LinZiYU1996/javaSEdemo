package Java_Multithreaded_Programming_Core_Technology.part4.实现生产者消费者模式交替打印.condition_test;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:18
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
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}
