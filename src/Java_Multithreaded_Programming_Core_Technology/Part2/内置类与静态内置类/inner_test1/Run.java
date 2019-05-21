package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_test1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:21 2019/5/21
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 由于持有不同的对象监视器，所以监视器结果打印结果是乱序。
         */
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        }, "A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        }, "B");
        t1.start();
        t2.start();
    }


}
