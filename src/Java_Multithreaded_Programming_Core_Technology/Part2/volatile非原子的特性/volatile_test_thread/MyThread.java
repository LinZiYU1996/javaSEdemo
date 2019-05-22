package Java_Multithreaded_Programming_Core_Technology.Part2.volatile非原子的特性.volatile_test_thread;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:59 2019/5/21
 */
public class MyThread extends Thread{

    volatile public static int count;
    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println( Thread.currentThread().getName()+ " count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }


}
