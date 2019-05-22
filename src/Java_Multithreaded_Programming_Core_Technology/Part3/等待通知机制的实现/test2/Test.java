package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.test2;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 从控制台打印的结果来看，3秒后线程被notify通知唤醒
 *
 *
 * @Date: Create in 10:57 2019/5/22
 */
public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            MyThread2 t2 = new MyThread2(lock);
            t1.start();
            Thread.sleep(3000);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
