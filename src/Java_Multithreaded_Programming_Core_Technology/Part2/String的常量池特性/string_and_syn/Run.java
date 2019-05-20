package Java_Multithreaded_Programming_Core_Technology.Part2.String的常量池特性.string_and_syn;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:17 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**]
         * 因为java的JVM中存在String常量池缓存的功能，所以传入"AA" 两个线程持有相同的锁
         * 造成B不能执行，这就是String常量池带来的问题。
         * 同步synchronized代码块都不使用String作为锁对象改用其他，
         * 比如new Object()实例化一个Object对象，但它并不放入缓存中。
         */
        ThreadA aThread = new ThreadA();
        ThreadB bThread = new ThreadB();
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
