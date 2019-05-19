package Java_Multithreaded_Programming_Core_Technology.Part2.方法内的变量为线程安全.t1;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 可见， 方法中的变量不存在非线程安全问题， 永远都是线程安全的。
 * 这是方法内部的变 量是私有的特性造成的。
 *
 *
 * @Date: Create in 21:44 2019/5/19
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA aThread = new ThreadA(numRef);
        aThread.start();
        ThreadB bThread = new ThreadB(numRef);
        bThread.start();
    }


}
