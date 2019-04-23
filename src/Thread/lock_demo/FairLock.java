package Thread.lock_demo;


import java.util.concurrent.locks.ReentrantLock;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * public ReentrantLock(boolean fair)
 * 当参数fair为true时， 表示锁是公平的。公平锁看起来很优美， 但是要实现公平锁必然
 *
 * 一
要求系统维护 个有序队列， 因此公平锁的实现成本比较高， 性能却非常低下， 因此， 在默
认情况下， 锁是非公平的。 如果没有特别的需求， 则不需要使用公平锁。 公平锁和非公平锁
一
 *
 *
 * @Date 21:19 2019/4/23
 **/
public class FairLock {


    public static class  FairLock_TYPE implements Runnable {

        public static ReentrantLock fairLock = new ReentrantLock(true);



        @Override
        public void run() {
                    while (true) {
                        try {
                            fairLock.lock();
                            System.out.println(Thread.currentThread().getName() + " 获取锁");
                        } finally {
                            fairLock.unlock();
                        }
                    }
        }
    }

    public static void main(String[] args) {
        FairLock_TYPE fairLock_type = new FairLock_TYPE();
        Thread thread = new Thread(fairLock_type,"NUM1");
        Thread thread1 = new Thread(fairLock_type,"NUM2");

        thread.start();

        thread1.start();

        //上述代码第2行指定锁是公平的。接着，由tl和t2两个线程分别请求这把锁，并且
        //一个控制台的输出，表示自已得到了锁。
    }


}
