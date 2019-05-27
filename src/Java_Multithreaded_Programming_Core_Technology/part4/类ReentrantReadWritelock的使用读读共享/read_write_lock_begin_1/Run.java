package Java_Multithreaded_Programming_Core_Technology.part4.类ReentrantReadWritelock的使用读读共享.read_write_lock_begin_1;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 16:03
* @Version:        1.0

*/
public class Run {

    //类Reentran tLock具有完全互斥排他的效果，即同时间只有个线程在执行
    //ReentrantLock.lock()方法后面的任务。这样做虽然保证了实例变釐的线程安全性，但效
    //一种读写锁ReentrantReadWriteLock类，使率却是非常低下的。所以在JDK中提供了
    //用它可以加快运行效率，在某些不需要操作实例变揽的方法中，完全可以使用读写锁 ReentrantReadWriteLock来提升该方法的代码运行速度。

    //读写锁表示也有两个锁，一个是读操作相关的锁，也称为共享锁；另个是写操作相关
    //的锁，也叫排他锁。也就是多个读锁之间不互斥，读锁与写锁互斥，写锁与写锁互斥。在没
    // 有线程Thread进行写入操作时，进行读取操作的多个T比ead都可以获取读锁，而进行写入
    //操作的Thread只有在获取写锁后才能进行写入操作。即多个Thread可以同时进行读取操作，
    //一时刻只允许一个T比ead进行写入操作。但是同


    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        //读读 不互斥
        a.start();
        b.start();
    }
}
