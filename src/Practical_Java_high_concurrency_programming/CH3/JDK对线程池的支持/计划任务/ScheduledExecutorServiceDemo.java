package Practical_Java_high_concurrency_programming.CH3.JDK对线程池的支持.计划任务;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 度程序实际上并不保证任务会无限期地持续调用。 如果任务本身抛出了异常， 那么后续的所有执行都会被中断， 因此， 如果你想让你的任务持续稳定地执行， 那么做好异常处理非常重要， 否则你很有可能观察到调度器无疾而终。
 *
 *
 *
 * @Date: Create in 20:03 2019/5/29
 */
public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService es = Executors.newScheduledThreadPool(10);
        es.scheduleAtFixedRate(new Runnable() {

            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(System.currentTimeMillis() / 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
    }


}
