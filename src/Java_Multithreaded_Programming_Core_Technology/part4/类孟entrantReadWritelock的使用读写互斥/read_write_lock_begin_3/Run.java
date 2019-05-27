package Java_Multithreaded_Programming_Core_Technology.part4.类孟entrantReadWritelock的使用读写互斥.read_write_lock_begin_3;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 21:06
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.setName("A");
        //读写互斥
        a.start();
        b.start();
    }
}
