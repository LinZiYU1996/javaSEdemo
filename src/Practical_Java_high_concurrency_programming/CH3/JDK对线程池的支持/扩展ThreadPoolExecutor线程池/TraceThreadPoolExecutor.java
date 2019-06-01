package Practical_Java_high_concurrency_programming.CH3.JDK对线程池的支持.扩展ThreadPoolExecutor线程池;

import java.util.concurrent.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:04 2019/6/1
 */
public class TraceThreadPoolExecutor extends ThreadPoolExecutor {

    public TraceThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


    public void execute(Runnable task) {
        super.execute(wrap(task, clientTrace(), Thread.currentThread().getName()));
    }


    public Future<?> submit(Runnable task) {
        return super.submit(wrap(task, clientTrace(), Thread.currentThread().getName()));
    }

    public Exception clientTrace() {
        return new Exception("Client stack trace");
    }

    public Runnable wrap(final Runnable task, final Exception clientStack, String clientThreadName) {
        return new Runnable() {

            public void run() {
                try {
                    task.run();
                } catch (Exception e) {
                    clientStack.printStackTrace();
                    throw e;
                }
            }
        };
    }

    public static class DivTask implements Runnable {
        int a, b;

        public DivTask(int a, int b) {
            this.a = a;
            this.b = b;
        }


        public void run() {
            double re = a / b;
            System.out.println(re);
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pools = new TraceThreadPoolExecutor(0, Integer.MAX_VALUE, 0L, TimeUnit.SECONDS, new
                SynchronousQueue<Runnable>());
        for (int i = 0; i < 5; i++) {
            pools.execute(new DivTask(100, i));
        }
    }




}
