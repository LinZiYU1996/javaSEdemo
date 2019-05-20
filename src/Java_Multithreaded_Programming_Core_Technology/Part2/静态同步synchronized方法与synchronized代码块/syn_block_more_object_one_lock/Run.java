package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_block_more_object_one_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:11 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * synchronized(X.class)和X类的synchronized static方法 同步锁实现
         */
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA aThread = new ThreadA(service1);
        ThreadB bThread = new ThreadB(service2);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
