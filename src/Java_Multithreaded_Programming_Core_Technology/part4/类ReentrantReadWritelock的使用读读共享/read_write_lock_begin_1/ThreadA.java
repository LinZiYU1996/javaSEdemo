package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用读读共享.read_write_lock_begin_1;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 16:05
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