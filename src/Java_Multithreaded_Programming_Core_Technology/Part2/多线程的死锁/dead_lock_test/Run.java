package Java_Multithreaded_Programming_Core_Technology.Part2.多线程的死锁.dead_lock_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:55 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
