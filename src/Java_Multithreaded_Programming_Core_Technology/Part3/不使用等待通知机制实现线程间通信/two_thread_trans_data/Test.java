package Java_Multithreaded_Programming_Core_Technology.Part3.不使用等待通知机制实现线程间通信.two_thread_trans_data;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:41 2019/5/22
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 由此，虽然线程之间实现了通信，但是B线程不断通过while轮询机制来检测某一个条件，这样会浪费CPU资源。
         *
         * 如果轮询的时间间隔很小， 更浪费
         * CPU资源；如果轮询的时间间隔很大， 有
         * 可能会取不到想要得到的数据。 所以就需要有一种机制来实现减少CPU的资源浪费，
         * 而且还可以实现在多个线程间通信，它就是"wait/notify" 机制。
         *
         *
         */
        MyList service = new MyList();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        bThread.start();
        aThread.start();
    }


}
