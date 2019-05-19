package Java_Multithreaded_Programming_Core_Technology.Part2.实例变量非线程安.t2;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 如果多个线程共同访问1个对象中的实例变量， 则有可能出现 “非线程安全” 问题。
 * 用线程访问的对象中如果有多个实例变量， 则运行的结果有可能出现交叉的情况。
 *
 *
 *
 * @Date: Create in 21:57 2019/5/19
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA aThread = new ThreadA(numRef);
        ThreadB bThread = new ThreadB(numRef);
        aThread.start();
        bThread.start();
    }


}
