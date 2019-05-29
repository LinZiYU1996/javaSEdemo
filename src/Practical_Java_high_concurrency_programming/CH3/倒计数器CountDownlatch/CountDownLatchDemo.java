package Practical_Java_high_concurrency_programming.CH3.倒计数器CountDownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:01 2019/5/29
 */
public class CountDownLatchDemo implements Runnable{

    //计数数量为 10, 这表示需要 10 个线
    //程完成任务后等待在CountDownLatch上的线程才能继续执行。
    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();


    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10) * 1000);
            System.out.println("check complete!");
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.submit(demo);
        }

        //CountDownLatch.await()方法， 要求主线程等待所有检查任
        //务全部完成， 待 10 个任务全部完成后， 主线程才能继续执行。


        end.await();
        System.out.println("Fire!");
        exec.shutdown();
    }
}
