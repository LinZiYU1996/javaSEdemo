package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 异步的原因是持有不同的锁， 一个是对象锁， 另外一个是Class锁，而Class锁可以对类的所有对
 *象实例起作
 *
 * @Date: Create in 20:58 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 对象锁 和 类锁 引起 C是异步运行的
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        ThreadC cThread = new ThreadC(service);
        aThread.setName("A");
        bThread.setName("B");
        cThread.setName("C");
        aThread.start();
        bThread.start();
        cThread.start();

    }


}
