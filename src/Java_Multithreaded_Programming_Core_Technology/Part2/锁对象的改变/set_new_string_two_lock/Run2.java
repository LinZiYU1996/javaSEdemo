package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_string_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 在将任何数据类型作为同步锁时， 需要注意的是，
 * 是否有多个线程同时持有锁对象， 如 果同时持有相同的锁对象，
 * 则这些线程之间就是同步的；如果分别获得锁对象， 这些线程之 间就是异步的。
 *
 *
 * @Date: Create in 10:26 2019/5/21
 */
public class Run2 {

    public static void main(String[] args) {
        /**
         * 线程AB都持有"123"的锁，虽然将锁改成了"456"，但结果还是同步的，因为A和B共同争抢的锁都是"123"
         * 另外：只要对象不变，即使对象的属性被改变，运行的结果还是同步。
         */
        MyService service = new MyService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
