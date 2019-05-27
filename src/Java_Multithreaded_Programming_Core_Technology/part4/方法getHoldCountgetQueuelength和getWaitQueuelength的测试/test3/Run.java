package Java_Multithreaded_Programming_Core_Technology.part4.方法getHoldCountgetQueuelength和getWaitQueuelength的测试.test3;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:24
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        //lock调用getWaitQueueLength(Condition)方法，返回于此锁定给定条件Condition的线程估计数。
        // 比如 有5个线程，每个都执行了condition的await,则调用过后返回的值是5
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
