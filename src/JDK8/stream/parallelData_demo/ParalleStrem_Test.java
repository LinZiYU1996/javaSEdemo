package JDK8.stream.parallelData_demo;


import java.util.stream.Stream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:06 2019/4/24
 **/
public class ParalleStrem_Test {


    //设你需要写一个方法，接受数字n作为参数，并返回从1到给定参数的所有数字的和。一个
    //直接（也许有点土）的方法是生成一个无穷大的数字流，把它限制到给定的数目，然后用对两个
    //数字求和的BinaryOperator来归约这个流

    public static long sqqueSum(long n){
        return Stream.
                iterate(1L,i -> i + 1).//生成自然数无限流
                limit(n).//限制到前n个数 对所有数字求
                reduce(0L,Long::sum);  //对所有数字求和来归纳流
    }


    //用更为传统的Java术语来说，这段代码与下面的迭代等价：
    public static long iterSum(long n){
        long result = 0;
        for (long i = 1L; i <= n ; i++) {
            result += i;
        }
        return result;
    }

    //将顺序流转换为并行流
    //你可以把流转换成并行流，从而让前面的函数归约过程（也就是求和）并行运行——对顺序
    //流调用parallel方法

    public static long parallelSum(long n){
        return Stream
                .iterate(1L,i -> i + 1 )
                .limit(n)
                .parallel()  //将流转换 为并行流
                .reduce(0L,Long::sum);

        //在上面的代码中，对流中所有数字求和的归纳过程的执行方式和最上面差不多。不同
        //之处在于Stream在内部分成了几块。因此可以对不同的块独立并行进行归纳操作
    }



    public static void main(String[] args) {

        System.out.println(sqqueSum(100));




    }
}
