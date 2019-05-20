package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_1;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 关键字synchronized拥有锁重入的功能，也就是在使用synchronized时，
 * 当一个线程 得到一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的。
 * 这也证明在一个 synchronized方法／块的内部调用本类的其他synchronized方法／块时，是永远可以得到锁的。
 *
 *
 * ”可重入锁＂ 的概念是：自己可以再次获取自己的内部锁。 比如有1条线程获得了某个对象的锁 ，
 * 此时这个对象锁还没 有释放， 当其再次想要获取这个对象的锁的时候还是可以获 取的， 如果不可锁重入的话
 * ， 就会造成死锁。
 *
 *
 *
 *
 *
 * @Date: Create in 11:29 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 可重入锁，也就是说，
         * 对象自己可以再次在synchronized方法类获取自己内部的synchronized方法。
         */
        MyThread myThread = new MyThread();
        myThread.start();
    }


}
