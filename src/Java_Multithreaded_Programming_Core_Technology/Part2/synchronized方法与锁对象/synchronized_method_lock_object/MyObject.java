package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法与锁对象.synchronized_method_lock_object;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:12 2019/5/19
 */
public class MyObject {

    public synchronized void methodA() {
        try {
            System.out.println("begin method A thread name = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        try {
            System.out.println("begin method B thread name = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
