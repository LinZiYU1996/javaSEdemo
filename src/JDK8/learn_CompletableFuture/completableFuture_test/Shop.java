package JDK8.learn_CompletableFuture.completableFuture_test;


import java.util.Random;
import java.util.concurrent.CompletableFuture;
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








}
