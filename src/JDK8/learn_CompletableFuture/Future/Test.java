package JDK8.learn_CompletableFuture.Future;


import java.util.concurrent.*;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 11:12 2019/4/26
 **/
public class Test {

    public static double doSomeLongComputation(){
        return new Double(2);
    }

    public static void doSomethingElse(){

    }

    public static void main(String[] args) {


        ExecutorService executor = Executors.newCachedThreadPool();  //创建ExecutorService，通 过它你可以 向线程池提 交任务
        Future<Double> future = executor.submit(new Callable<Double>() {  //向ExecutorService提交一个Callable对象
            public Double call() {
                return doSomeLongComputation();  //以异步方式在新的线程中执 行耗时的操作
            }});
        doSomethingElse();  //异步操作进行的同时 你可以做其他的事情
        try {
            Double result = future.get(1, TimeUnit.SECONDS);
        } catch (ExecutionException ee) {
            // 计算抛出一个异常
        } catch (InterruptedException ie) {
            // 当前线程在等待过程中被中断
        } catch (TimeoutException te) {
            // 在Future对象完成之前超过已过期
        }


        //这种编程方式让你的线程可以在ExecutorService以并发方式调
        //用另一个线程执行耗时操作的同时，去执行一些其他的任务。接着，如果你已经运行到没有异步
        //操作的结果就无法继续任何有意义的工作时，可以调用它的get方法去获取操作的结果。如果操
        //作已经完成，该方法会立刻返回操作的结果，否则它会阻塞你的线程，直到操作完成，返回相应
        //的结果。
        //你能想象这种场景存在怎样的问题吗？如果该长时间运行的操作永远不返回了会怎样？为
        //了处理这种可能性，虽然Future提供了一个无需任何参数的get方法，我们还是推荐大家使用重
        //载版本的get方法，它接受一个超时的参数，通过它，你可以定义你的线程等待Future结果的最
        //长时间，而不是永无止境地等待下去。




    }

}
