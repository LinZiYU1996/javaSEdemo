package Practical_Java_high_concurrency_programming.CH3.JDK对线程池的支持.线程池和拒绝策略的使用;

import java.util.concurrent.*;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 自定义了一个线程池。 该线程池有5个常驻线程， 并且最大线
 * 程数量也是 5 个。 这和固定大小的线程池是一样的。 但是它却拥有一个只有 10 个容量的等待队列。
 *
 * 因为使用无界队列很可能并不是最佳解决方案， 如果任务量极大， 很有可能会把内存 “ 撑死 ” 。给出一个合理的队列大小， 也是合乎常理的选择。 同时， 这里自定义了拒
 *将任务丢弃的信息进行打印
 *
 *
 *
 *
 *
 *
 *
 * @Date: Create in 15:53 2019/6/1
 */
public class RejectThreadPoolDemo {

    public static class MyTask implements Runnable {

        public void run() {
            System.out.println(System.currentTimeMillis() + "thread id:" + Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        ExecutorService es = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<Runnable>(10),
                Executors.defaultThreadFactory(),
                new RejectedExecutionHandler() {

                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        System.out.println(r.toString() + " is discard");
                    }
                });
        for(int i=0;i<Integer.MAX_VALUE;i++){
            es.submit(task);
            Thread.sleep(10);
        }
    }


}
