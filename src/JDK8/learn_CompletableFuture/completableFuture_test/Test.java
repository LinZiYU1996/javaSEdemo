package JDK8.learn_CompletableFuture.completableFuture_test;


import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 15:22 2019/4/26
 **/
public class Test {


    private double calculatePrice(String product) {
        Random random = new Random();
//        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }


    //使用工厂方法supplyAsync创建CompletableFuture对象
    public Future<Double> getPriceAsync(String product){
        return CompletableFuture.supplyAsync (() -> calculatePrice(product));
        //supplyAsync方法接受一个生产者（Supplier）作为参数，返回一个CompletableFuture
        //对象，该对象完成异步执行后会读取调用生产者方法的返回值。生产者方法会交由ForkJoinPool
        //池中的某个执行线程（Executor）运行，但是你也可以使用supplyAsync方法的重载版本，传
        //递第二个参数指定不同的执行线程执行生产者方法。一般而言，向CompletableFuture的工厂
        //方法传递可选参数，指定生产者方法的执行线程是可行的，


    }


}
