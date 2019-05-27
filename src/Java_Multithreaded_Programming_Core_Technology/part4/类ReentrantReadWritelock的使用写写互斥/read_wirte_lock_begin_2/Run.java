package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用写写互斥.read_wirte_lock_begin_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 20:59
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.setName("A");
        //写写互斥
        b.start();
        a.start();
    }
}
