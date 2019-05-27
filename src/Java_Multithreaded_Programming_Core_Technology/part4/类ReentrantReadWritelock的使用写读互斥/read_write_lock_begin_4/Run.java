package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用写读互斥.read_write_lock_begin_4;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 21:09
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.setName("A");
        //写读互斥
        b.start();
        a.start();
    }
}
