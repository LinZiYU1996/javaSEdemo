package JDK8.reduction_demo;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:04 2019/4/22
 **/
public class Test {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        //元素求和

        //使用for-each循环来对数字列表中的
        //元素求和：
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        System.out.println(sum);

        System.out.println("================================");

        //要是还能把所有的数字相乘，而不必去复制粘贴这段代码，岂不是很好？这正是reduce操
        //作的用武之地，它对这种重复应用的模式做了抽象。你可以像下面这样对流中所有的元素求和

        int sum_1 = 0;
        sum_1 = numbers.stream().reduce(0,(a, b) -> a + b );
        System.out.println(sum_1);


        //reduce接受两个参数：
        // 一个初始值，这里是0；
        // 一个BinaryOperator<T>来将两个元素结合起来产生一个新值，这里我们用的是
        //lambda (a, b) -> a + b。
        //你也很容易把所有的元素相乘，只需要将另一个Lambda：(a, b) -> a * b传递给reduce
        //操作就可以了

        System.out.println("================================");
        //在Java 8中，Integer类现在有了一个静态的sum
        //方法来对两个数求和，这恰好是我们想要的，用不着反复用Lambda写同一段代码了

        int sum_2 = 0;
        sum_2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum_2);

        System.out.println("================================");



        //最大值和最小值

        //你可以像下面这样使用reduce来计算流中的最大值

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max);





    }


}
