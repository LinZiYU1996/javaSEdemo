package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_static_method;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 关键字synchronized还可以应用在static静态方法上，如果这样写，那是对当前的*.java文
 * 件对应的Class类进行持锁，
 *
 *
 * @Date: Create in 20:54 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 类的同步锁
         */
        ThreadA aThread = new ThreadA();
        ThreadB bThread = new ThreadB();
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();

        //从运行结果来看， 并没有什么特别之处， 都是同步的效果，
        // 和将synchronized关键字加到非 static方法上使用的效果是一样的。
        // 其实还是有本质上的不同的，synchronized关键字加到static 静态方法上是给Class类上锁，
        // 而synchronized关键字加到非static静态方法上是给对象上锁。


    }


}
