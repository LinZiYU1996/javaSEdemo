package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_test2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:22 2019/5/21
 */
public class OutClass {

    static class InnerClass1 {
        public void method1(innerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + " in class1 method1");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " out class1 method1");
            }
        }

        synchronized public void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " in class1 method2");
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " out class1 method2");
        }
    }

    static class innerClass2 {
        synchronized public void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " in class2 method1");
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " out class2 method1");
        }
    }


}
