package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_more_object_static_one_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:08 2019/5/20
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("thread name = " + Thread.currentThread().getName() + " in printA at " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("thread name = " + Thread.currentThread().getName() + " out printA at " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("thread name = " + Thread.currentThread().getName() + " in printB at " + System.currentTimeMillis());
        System.out.println("thread name = " + Thread.currentThread().getName() + " out printB at " + System.currentTimeMillis());
    }


}
