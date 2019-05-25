package Java_Multithreaded_Programming_Core_Technology.part4.实扣灶扫节消费者模式多对多交替打印.condition_test_many_to_many;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:20
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
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}
