package Practical_Java_high_concurrency_programming.CH3.JDK对线程池的支持.固定大小的线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:00 2019/5/29
 */
public class ThreadPoolDemo {

    public static class MyTask implements Runnable {


        public void run() {
            System.out.println(System.currentTimeMillis() + " Thread id:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 前5个线程执行时间和后5个比差了1秒钟
    public static void main(String[] args) {
        MyTask task = new MyTask();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            es.submit(task);
        }
    }




}
