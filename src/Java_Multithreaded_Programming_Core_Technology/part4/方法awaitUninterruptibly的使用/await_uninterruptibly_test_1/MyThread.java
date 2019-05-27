package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUninterruptibly的使用.await_uninterruptibly_test_1;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:48
* @Version:        1.0

*/
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
