package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.test2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:57 2019/5/22
 */
public class MyThread2 extends Thread{

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("begin notify time " + System.currentTimeMillis());
            lock.notify();
            System.out.println("  end notify time " + System.currentTimeMillis());
        }
    }


}
