package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用写写互斥.read_wirte_lock_begin_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 20:59
* @Version:        1.0

*/
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}