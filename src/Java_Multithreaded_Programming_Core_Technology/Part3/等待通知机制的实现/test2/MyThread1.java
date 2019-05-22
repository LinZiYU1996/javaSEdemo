package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.test2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:56 2019/5/22
 */
public class MyThread1 extends Thread{

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                System.out.println("begin time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("  end time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
