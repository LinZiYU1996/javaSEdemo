package Thread.lock_demo;


import java.util.concurrent.locks.ReentrantLock;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 20:57 2019/4/23
 **/
public class Interrupt_Features {

    public static class IntLock implements Runnable{

        public static ReentrantLock lock1 = new ReentrantLock();

        public static ReentrantLock lock2 = new ReentrantLock();

        int lock;

        public IntLock(int lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                if (lock == 1) {
                    lock1.lockInterruptibly();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                    }
                    lock2.lockInterruptibly();
                }else {
                    lock2.lockInterruptibly();
                    try {
                        Thread.sleep(5000);
                    }catch (InterruptedException e) {

                    }
                    lock1.lockInterruptibly();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                if (lock1.isHeldByCurrentThread()) {
                    lock1.unlock();
                }
                if (lock2.isHeldByCurrentThread()) {
                    lock2.unlock();
                }
                System.out.println(Thread.currentThread().getId() + " : 退出");
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        IntLock intLock1 = new IntLock(1);
        IntLock intLock2 = new IntLock(2);
        Thread thread1 = new Thread(intLock1);
        Thread thread2 = new Thread(intLock2);

        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        thread2.interrupt();

        //模拟死锁
        //得益于锁中断，该问题可以解决

    }

}
