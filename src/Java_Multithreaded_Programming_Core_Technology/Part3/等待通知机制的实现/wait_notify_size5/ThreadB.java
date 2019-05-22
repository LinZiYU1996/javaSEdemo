package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.wait_notify_size5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:01 2019/5/22
 */
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                MyList.add();
                if (MyList.size() == 5) {
                    lock.notify();
                    System.out.println("notify sent!");
                }
                System.out.println("add " + (i + 1));
            }
        }
    }


}
