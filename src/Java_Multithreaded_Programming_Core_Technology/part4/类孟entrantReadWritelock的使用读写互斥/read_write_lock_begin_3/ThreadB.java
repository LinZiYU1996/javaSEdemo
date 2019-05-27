package Java_Multithreaded_Programming_Core_Technology.part4.类孟entrantReadWritelock的使用读写互斥.read_write_lock_begin_3;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 21:06
* @Version:        1.0

*/
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}