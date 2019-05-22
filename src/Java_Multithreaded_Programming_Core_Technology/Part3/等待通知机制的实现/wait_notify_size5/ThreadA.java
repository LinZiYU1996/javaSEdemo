package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.wait_notify_size5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:01 2019/5/22
 */
public class ThreadA extends Thread{

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
