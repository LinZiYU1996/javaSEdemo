package Thread.threadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
 *
 * @Date 19:42 2019/4/19
 **/
public class TestPool2 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        for(int i = 0 ; i < 10 ; i++){
            final  int index = i;
            Thread.sleep(1000*1);
            newCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }

    }

}
