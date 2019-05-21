package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_test1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:20 2019/5/21
 */
public class OutClass {

    static class Inner {
        public void method1() {
            synchronized ("其他的锁") {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
