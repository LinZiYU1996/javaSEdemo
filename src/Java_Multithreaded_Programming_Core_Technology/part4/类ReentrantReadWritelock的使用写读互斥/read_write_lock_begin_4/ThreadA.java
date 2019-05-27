package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用写读互斥.read_write_lock_begin_4;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 21:09
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