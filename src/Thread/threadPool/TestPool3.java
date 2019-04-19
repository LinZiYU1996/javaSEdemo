package Thread.threadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 *
 * @Date 19:50 2019/4/19
 **/
public class TestPool3 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 50 ; i++) {
            final int index = i;
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }


    }

}
