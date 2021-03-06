package Thread.callableAndfuture;


import java.util.concurrent.*;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 *
 * @Date 12:34 2019/4/19
 **/
public class TestCallable4 {

    public static void main(String[] args) {
        System.out.println("-----------------");
        ExecutorService executor = Executors.newCachedThreadPool();
        Task4 task = new Task4();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }


}

class  Task4 implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
