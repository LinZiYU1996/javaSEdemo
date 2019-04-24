package JDK8.stream.parallelData_demo;


import JDK8.lambda_demo.Functional_interface.function_demo.Function;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * 流性能测试
 * @Date 10:15 2019/4/24
 **/
public class performance_Test {

    //测量对前n个自然数求和的函数的性能

    //这个方法接受一个函数和一个long作为参数。它会对传给方法的long应用函数10次，记录
    //每次执行的时间（以毫秒为单位），并返回最短的一次执行时间。
    public static long measureSum(Function<Long,Long> adder,long n){
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10 ; i++) {
            long start  = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("结果： " + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }


    public static void main(String[] args) {

    }

}
