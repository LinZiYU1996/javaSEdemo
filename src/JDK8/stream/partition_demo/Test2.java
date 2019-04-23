package JDK8.stream.partition_demo;


import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 16:16 2019/4/23
 **/
public class Test2 {

    //设你要写一个方法，它接受参数int n，并将前n个自然数分为质数和非质数。但首先，找
    //出能够测试某一个待测数字是否是质数的谓词会很有帮助

    public static boolean isPrime(int candidate){ return IntStream
            .range(2,candidate) //产生一个自然数 范围，从2开始，直至但不包括待测数
                .noneMatch(i -> candidate % i == 0);//如果待测数字不能被流中任何数字整除则返回true
    }

    //一个简单的优化是仅测试小于等于待测数平方根的因子

    public static boolean isPrime_Better(int candidate) {
        int candidateToot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2,candidateToot)
                .noneMatch( i -> candidate % i == 0);
    }


    //现在最主要的一部分工作已经做好了。为了把前n个数字分为质数和非质数，只要创建一
    //个包含这n个数的流，用刚刚写的isPrime方法作为谓词，再给partitioningBy收集器归约
    //就好了：

    public static Map<Boolean, List<Integer>> partitionPrime(int n){
        return IntStream.rangeClosed(2,n).boxed()
                .collect(partitioningBy(candidate -> isPrime_Better(candidate)));
    }

    public static void main(String[] args) {


        System.out.println(partitionPrime(100));


    }
}
