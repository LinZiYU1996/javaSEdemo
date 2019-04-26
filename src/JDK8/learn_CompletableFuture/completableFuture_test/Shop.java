package JDK8.learn_CompletableFuture.completableFuture_test;


import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 商店
应该声明依据指定产品名称返回价格的方法
 * @Date 11:22 2019/4/26
 **/
public class Shop {

    //该方法的内部实现会查询商店的数据库，但也有可能执行一些其他耗时的任务，比如联系其
    //他外部服务（比如，商店的供应商，或者跟制造商相关的推广折扣）。
    public double getPrice(String product) {
        // 待实现
        return calculatePrice(product);

    }


    //模拟1秒钟延迟的方法
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private double calculatePrice(String product) {
        Random random = new Random();
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }



    //将同步方法转换为异步方法


    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {   //创建CompletableFuture 对象，它会包含计算的结果
            double price = calculatePrice(product);  //在另一个线程中以异步方式 执行计算
            futurePrice.complete(price);  //需长时间计算的任务结束并得出结果时，设置 Future的返回值
        }).start();
        return futurePrice;  //无需等待还没结束的计算，直接返回Future对象
    }

    //创建了一个代表异步计算的CompletableFuture对象实例，它在计算完
    //成时会包含计算的结果。接着，你调用fork创建了另一个线程去执行实际的价格计算工作，不
    //等该耗时计算任务结束，直接返回一个Future实例。当请求的产品价格最终计算得出时，你可
    //以使用它的complete方法，结束completableFuture对象的运行，并设置变量的值。很显然，
    //这个新版Future的名称也解释了它所具有的特性

    public static void doSomethingElse(){

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Shop shop = new Shop();
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("My Love");
        long invotime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("after" + invotime + " msecs");
        doSomethingElse();
        double price = futurePrice.get();
        System.out.println(" price is" + price);
        long retriveTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price after " + retriveTime + " msecs");





    }








}
