package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_test2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:23 2019/5/21
 */
public class Run {


    public static void main(String[] args) {
        final OutClass.InnerClass1 in1 = new OutClass.InnerClass1();
        final OutClass.innerClass2 in2 = new OutClass.innerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        }, "T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        }, "T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }


}
