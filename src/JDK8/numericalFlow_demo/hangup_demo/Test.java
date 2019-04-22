package JDK8.numericalFlow_demo.hangup_demo;


import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 创建一个勾股数流。
 *
 * @Date 17:06 2019/4/22
 **/
public class Test {


    public static void main(String[] args) {

        //表示三元数
        //那么，怎么入手呢？第一步是定义一个三元数。虽然更恰当的做法是定义一个新的类来表示
        //三元数，但这里你可以使用具有三个元素的int数组，比如new int[]{3, 4, 5}，来表示勾股
        //数(3, 4, 5)。现在你就可以用数组索引访问每个元素了

        // 筛选成立的组合
        //假定有人为你提供了三元数中的前两个数字：a和b。怎么知道它是否能形成一组勾股数呢？
        //你需要测试a * a + b * b的平方根是不是整数，也就是说它没有小数部分——在Java里可以
        //使用expr % 1表示。如果它不是整数，那就是说c不是整数。你可以用filter操作表达这个要
        //求（你稍后会了解到如何将其连接起来成为有效代码）：

        //filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)

        //假设周围的代码给a提供了一个值，并且stream提供了b可能出现的值，filter将只选出那
        //些可以与a组成勾股数的b。你可能在想Math.sqrt(a * a + b * b) % 1 == 0这一行是怎么
        //回事。简单来说，这是一种测试Math.sqrt(a * a + b * b)返回的结果是不是整数的方法。
        //如果平方根的结果带了小数，如9.1，这个条件就不成立（9.0是可以的）


        //生成三元组
        //在筛选之后，你知道a和b能够组成一个正确的组合。现在需要创建一个三元组。你可以使用
        //map操作，像下面这样把每个元素转换成一个勾股数组：

        //stream.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
        // .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});

        // 生成b值

        //现在你需要生成b的值。前面已经看到，Stream.rangeClosed让你可以在给定
        //区间内生成一个数值流。你可以用它来给b提供数值，这里是1到100：
        //IntStream.rangeClosed(1, 100)
        // .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
        // .boxed()
        // .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});

        //请注意，你在filter之后调用boxed， 从rangeClosed返回的IntStream生成一个
        //Stream<Integer>。这是因为你的map会为流中的每个元素返回一个int数组。而IntStream
        //中的map方法只能为流中的每个元素返回另一个int，这可不是你想要的！你可以用IntStream
        //的mapToObj方法改写它，这个方法会返回一个对象值流：
        //IntStream.rangeClosed(1, 100)
        // .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
        // .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});


        //生成值
        //这里有一个关键的假设：给出了a的值。 现在，只要已知a的值，你就有了一个可以生成勾
        //股数的流。如何解决这个问题呢？就像b一样，你需要为a生成数值！最终的解决方案如下所示：

        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );

        //好的，flatMap又是怎么回事呢？首先，创建一个从1到100的数值范围来生成a的值。对每
        //个给定的a值，创建一个三元数流。要是把a的值映射到三元数流的话，就会得到一个由流构成的
        //流。flatMap方法在做映射的同时，还会把所有生成的三元数流扁平化成一个流。这样你就得到
        //了一个三元数流。还要注意，我们把b的范围改成了a到100。没有必要再从1开始了，否则就会造
        //成重复的三元数，例如(3,4,5)和(4,3,5)

        //现在你可以运行解决方案，并且可以利用我们前面看到的limit命令，明确限定从生成的流
        //中要返回多少组勾股数了：

        pythagoreanTriples.limit(5)
                .forEach(t ->
                        System.out.println(t[0] + ", " + t[1] + ", " + t[2]));



        //你还能做得更好吗？
        //目前的解决办法并不是最优的，因为你要求两次平方根。让代码更为紧凑的一种可能的方法
        //是，先生成所有的三元数(a*a, b*b, a*a+b*b)，然后再筛选符合条件的

        Stream<double[]> pythagoreanTriples2 =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .mapToObj(
                                                b -> new double[]{a, b, Math.sqrt(a*a + b*b)})
                                        .filter(t -> t[2] % 1 == 0));




    }

}
