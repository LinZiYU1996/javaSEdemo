package Practical_Java_high_concurrency_programming.CH3.允许多个线程同时访问信号量Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:43 2019/5/29
 */
public class SemapDemo implements Runnable{


    //5个一组输出
    final Semaphore semp = new Semaphore(5);
    //包含 5 个许可的信号量。 这就意味着同时可以有 5 个线程进入



    public void run() {
        try {
            //申请信号量使用 acquire()方法操作， 在离开时， 务必使用 release()方法释放信号量
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + " done!");
            semp.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String []args){
        ExecutorService exec = Executors.newFixedThreadPool(20);
        final SemapDemo demo = new SemapDemo();
        for(int i=0;i<20;i++){
            exec.submit(demo);
        }
    }



}
