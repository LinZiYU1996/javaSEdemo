package FunctionalProgram.Stream;

import FunctionalProgram.Data.Track;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //
 *   常用的流操作
 * @Date 11:18 2019/4/27
 **/
public class CommonOperations {

    public static void main(String[] args) {

        //collect(toList()) 方法由 Stream 里的值生成一个列表，是一个及早求值操作


        List<String> collected = Stream.of("a", "b", "c")
                .collect(toList());

        //使用 collect(toList()) 方法从 Stream 中生成一个列表。
        //由于很多 Stream 操作都是惰性求值，因此调用 Stream 上一系列方法之后，还需要最后再
        //调用一个类似 collect 的及早求值方法。



        //如果有一个函数可以将一种类型的值转换成另外一种类型，map 操作就可以
        //使用该函数，将一个流中的值转换成一个新的流


        //使用 for 循环将字符串转换为大写

        List<String> collected_ = new ArrayList<>();
        for (String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }


        //使用 map 操作将字符串转换为大写形式


        List<String> collected__ = Stream.of("a", "b", "hello")

                //传给 map 的 Lambda 表达式只接受一个 String 类型的参数，返回一个新的 String。参数
                //和返回值不必属于同一种类型，但是 Lambda 表达式必须是 Function 接口的一个实例
                //Function 接口是只包含一个参数的普通函数接口。


                .map(string -> string.toUpperCase())
                .collect(toList());




        //遍历数据并检查其中的元素时，可尝试使用 Stream 中提供的新方法 filter



        //假设要找出一组字符串
        //中以数字开头的字符串，比如字符串 "1abc" 和 "abc"，其中 "1abc" 就是符合条件的字符串。
        //可以使用一个 for 循环，内部用 if 条件语句判断字符串的第一个字符来解决这个问题，


        List<String> beginningWithNumbers = new ArrayList<>();
        for(String value : asList("a", "1abc", "abc1")) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
        }

        //函数式风格

        List<String> beginningWithNumber
                = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());

        //和 map 很像，filter 接受一个函数作为参数，该函数用 Lambda 表达式表示。该函数和前面
        //示例中 if 条件判断语句的功能一样，如果字符串首字母为数字，则返回 true。若要重构
        //遗留代码，for 循环中的 if 条件语句就是一个很强的信号，可用 filter 方法替代。
        //由于此方法和 if 条件语句的功能相同，因此其返回值肯定是 true 或者 false。经过过滤，
        //Stream 中符合条件的，即 Lambda 表达式值为 true 的元素被保留下来。该 Lambda 表达式
        //的函数接口正是前面章节中介绍过的 Predicate



        //flatMap 方法可用 Stream 替换值，然后将多个 Stream 连接成一个 Stream


        //前面已介绍过 map 操作，它可用一个新的值代替 Stream 中的值。但有时，用户希望让 map
        //操作有点变化，生成一个新的 Stream 对象取而代之。用户通常不希望结果是一连串的流，
        //此时 flatMap 最能派上用场。




        //包含多个列表的 Stream


        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());


        //调用 stream 方法，将每个列表转换成 Stream 对象，其余部分由 flatMap 方法处理。
        //flatMap 方法的相关函数接口和 map 方法的一样，都是 Function 接口，只是方法的返回值
        //限定为 Stream 类型罢了





        //Stream 上常用的操作之一是求最大值和最小值。Stream API 中的 max 和 min 操作足以解决
        //这一问题

        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));


        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getNum()))
                .get();



        //查找 Stream 中的最大或最小元素，首先要考虑的是用什么作为排序的指标。以查找专辑中
        //的最短曲目为例，排序的指标就是曲目的长度。
        //为了让 Stream 对象按照曲目长度进行排序，需要传给它一个 Comparator 对象。Java 8 提
        //供了一个新的静态方法 comparing，使用它可以方便地实现一个比较器。放在以前，我们
        //需要比较两个对象的某项属性的值，现在只需要提供一个存取方法就够了。本例中使用
        //getLength 方法。
        //花点时间研究一下 comparing 方法是值得的。实际上这个方法接受一个函数并返回另一个函数。
        //我知道，这听起来像句废话，但是却很有用。这个方法本该早已加入 Java 标准库，但由于匿名
        //内部类可读性差且书写冗长，一直未能实现。现在有了 Lambda 表达式，代码变得简洁易懂





        //reduce 操作可以实现从一组值中生成一个值。在上述例子中用到的 count、min 和 max 方
        //法，因为常用而被纳入标准库中。事实上，这些方法都是 reduce 操作。



        //使用 reduce 求和

        int count = Stream.of(1,2,3)
                .reduce(0,(acc,element) -> acc + element);

        System.out.println(count);

        //Lambda 表达式的返回值是最新的 acc，是上一轮 acc 的值和当前元素相加的结果


        //展开 reduce 操作


        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count_ = accumulator.apply(
                accumulator.apply(
                        accumulator.apply(0, 1),
                        2),
                3);



        //使用命令式编程方式求和


        int acc = 0;
        for (Integer element : asList(1, 2, 3)) {
            acc = acc + element;
        }



        //在命令式编程方式下，每一次循环将集合中的元素和累加器相加，用相加后的结果更新累
        //加器的值。对于集合来说，循环在外部，且需要手动更新变量










    }
}
