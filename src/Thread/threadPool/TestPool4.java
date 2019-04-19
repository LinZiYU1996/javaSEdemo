package Thread.threadPool;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *创建一个定长线程池，支持定时及周期性任务执行
 * @Date 19:53 2019/4/19
 **/
public class TestPool4 {

    public static void main(String[] args) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);

        newScheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        //表示延迟3秒执行。
    }

}
