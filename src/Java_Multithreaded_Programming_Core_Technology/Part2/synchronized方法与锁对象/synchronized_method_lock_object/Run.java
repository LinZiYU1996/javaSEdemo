package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法与锁对象.synchronized_method_lock_object;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:13 2019/5/19
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 如果不加synchronized会出现A输出后等待，然后转而执行B，如果加了,那么两个如果A发生那么B就开始等着A执行完成后，再执行。
         * 另外：aThread在调用synchronized的A，bThread是可以调用MyObject的其他方法的。
         *
         * 书上结论：
         * 1.A线程先持有object对象的lock，B线程可以以异步滴啊哦哟版的方式调用object对象中飞synchronized类型的方法。
         * 2.A线程先持有object对象的lock，B线程如果在这时调用object对象中的synchronized类型的方法则需等待，也就是同步。
         */
        MyObject object = new MyObject();
        ThreadA aThread = new ThreadA(object);
        ThreadB bThread = new ThreadB(object);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
