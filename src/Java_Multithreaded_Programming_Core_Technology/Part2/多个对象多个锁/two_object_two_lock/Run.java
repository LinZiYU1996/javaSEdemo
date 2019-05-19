package Java_Multithreaded_Programming_Core_Technology.Part2.多个对象多个锁.two_object_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 两个线程分别访问同一个类的两个不同实例的相
 * 同名称的同步方法，效果却是以异步的方式运行的。本示例由于
 * 创建了2个业务对象，在系统中产生出2个锁，所以运行结果是
 *
 * 异步的，打印的效果就是先打印b,然后打印a。
 * 从上面程序运行结果来看，虽然在HasSelfPrivateNum.java中使用了synchronized关键字，
 * 但打印的顺序却不是同步的，是交叉的。为什么是这样的结果呢？
 * 关键字synchronized取得的锁都是对象锁，而不是把一段代码或方法（函数）当作锁， 所以在上面的示例中，
 * 哪个线程先执行带synchronized关键字的方法，哪个线程就持有该方 法所属对象的锁Lock,那么其他线程只能呈等待状态，
 * 前提是多个线程访问的是同一个 对象。
 * 但如果多个线程访问多个对象，则NM会创建多个锁。上面的示例就是创建了2个 HasSelfPrivateNum.java类的对象，所以就会产生出2个锁。
 *
 *
 * @Date: Create in 22:02 2019/5/19
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        //多个对象会产生多个锁，也就是说，两个互不干扰
        ThreadA aThread = new ThreadA(numRef1);
        ThreadB bThread = new ThreadB(numRef2);
        aThread.start();
        bThread.start();
    }


}
