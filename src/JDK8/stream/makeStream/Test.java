package JDK8.stream.makeStream;


import java.util.Arrays;
import java.util.stream.Stream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *构建流
 *
 * @Date 17:26 2019/4/22
 **/
public class Test {

    public static void main(String[] args) {

        //由值创建流
        //你可以使用静态方法Stream.of，通过显式值创建一个流。它可以接受任意数量的参数。例
        //如，以下代码直接使用Stream.of创建了一个字符串流。然后，你可以将字符串转换为大写，再
        //一个个打印出来

        Stream<String> stringStream = Stream.of("Java8","Lamdba","In");
        stringStream.map(String::toUpperCase)
                .forEach(System.out::println);


        //你可以使用empty得到一个空流，如下所示：

        Stream<String> emptyStream = Stream.empty();

        //由数组创建流
        //你可以使用静态方法Arrays.stream从数组创建一个流。它接受一个数组作为参数。例如，
        //你可以将一个原始类型int的数组转换成一个IntStream，如下所示：

        int[] numbers = {2,5,8,9,6,4,3,1};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        //由函数生成流：创建无限流
        //Stream API提供了两个静态方法来从函数生成流：Stream.iterate和Stream.generate。
        //这两个操作可以创建所谓的无限流：不像从固定集合创建的流那样有固定大小的流。由iterate
        //和generate产生的流会用给定的函数按需创建值，因此可以无穷无尽地计算下去！一般来说，
        //应该使用limit(n)来对这种流加以限制，以避免打印无穷多个值。

        //迭代
        //我们先来看一个iterate的简单例子

        Stream.iterate(0,n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        //iterate方法接受一个初始值（在这里是0），还有一个依次应用在每个产生的新值上的
        //Lambda（UnaryOperator<t>类型）。这里，我们使用Lambda n -> n + 2，返回的是前一个元
        //素加上2。因此，iterate方法生成了一个所有正偶数的流：流的第一个元素是初始值0。然后加
        //上2来生成新的值2，再加上2来得到新的值4，以此类推。这种iterate操作基本上是顺序的，
        //因为结果取决于前一次应用。请注意，此操作将生成一个无限流——这个流没有结尾，因为值是
        //按需计算的，可以永远计算下去。我们说这个流是无界的。正如我们前面所讨论的，这是流和集
        //合之间的一个关键区别。我们使用limit方法来显式限制流的大小。这里只选择了前10个偶数。
        //然后可以调用forEach终端操作来消费流，并分别打印每个元素。
        //一般来说，在需要依次生成一系列值的时候应该使用iterate，比如一系列日期：1月31日，
        //2月1日，依此类推




        //生成
        //与iterate方法类似，generate方法也可让你按需生成一个无限流。但generate不是依次
        //对每个新生成的值应用函数的。它接受一个Supplier<T>类型的Lambda提供新的值。我们先来
        //看一个简单的用法：

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);


        //这段代码将生成一个流，其中有五个0到1之间的随机双精度数
        //Math.Random静态方法被用作新值生成器。同样，你可以用limit方法显式限制流的大小，
        //否则流将会无限长























    }

}
