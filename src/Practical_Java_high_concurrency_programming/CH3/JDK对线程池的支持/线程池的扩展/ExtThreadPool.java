package Practical_Java_high_concurrency_programming.CH3.JDK对线程池的支持.线程池的扩展;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 扩展了原有的线程池， 实现了 beforeExecuteO、 afterExecute()和 terminiated()三个方法。这三个方法分别用于记录一个任务的开始、 结束和整个线程池的退
 * 出。
 *
 *
 * @Date: Create in 16:00 2019/6/1
 */
public class ExtThreadPool {

    public static class MyTask implements Runnable {
        public String name;

        public MyTask(String name) {
            this.name = name;
        }


        public void run() {
            System.out.println("正在执行" + ":Thread id" + Thread.currentThread().getId() + ", Task name:" + this.name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = new ThreadPoolExecutor(5, 5, 0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<Runnable>()) {

            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("准备执行：" + ((MyTask) r).name);
            }


            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("执行完成：" + ((MyTask) r).name);
            }


            protected void terminated() {
                System.out.println("线程池退出！");
            }
        };
        for(int i =0;i<5;i++){
            MyTask task = new MyTask("TASK-GEYM-"+i);
            es.execute(task);
            Thread.sleep(10);
        }
        es.shutdown();
    }


}
