package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUntil的使用.await_until_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:53
* @Version:        1.0

*/
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }

}
