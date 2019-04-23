package Thread.lock_demo;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 锁申请等待限时
 *
 * @Date 21:05 2019/4/23
 **/
public class TryLock_Features {


    public static class TimeLock implements Runnable{

        public static ReentrantLock lock = new ReentrantLock();


        //tryLock() 两个参数  一个表示等待时长  一个表示计时单位


        @Override
        public void run() {
                try {
                    if (lock.tryLock(5, TimeUnit.SECONDS)) {//线程在这个锁请求中最多等待 5 秒 超过的话就返回false
                        Thread.sleep(6000);
                    } else {
                        System.out.println(" get lock failed");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lock.isHeldByCurrentThread()) {
                        lock.unlock();
                    }
                }
        }


    }

    ////ReentrantLock. try Lock()方法也可以不带参数直接运行。 在这种情况下，
    //        // 当前线程会尝试获得锁， 如果锁并未被其他线程占用， 则申请锁会成功，
    //        // 并立即返回true。 如果锁被其他 线程占用， 则当前线程不会进行等待， 而是立即返回 false。这种模式不会引起线程等待， 因此也不会产生死锁。

    public static class TryLock_F implements Runnable {

        public static ReentrantLock lockl = new ReentrantLock();

        public static ReentrantLock lock2 = new ReentrantLock();

        int lock;

        public TryLock_F(int lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
                //TODD
        }
    }







    public static void main(String[] args) {
        TimeLock t1 = new TimeLock();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);

        thread1.start();
        thread2.start();

    }
}

