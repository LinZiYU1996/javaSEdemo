package JDK8.stream.collectData;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:40 2019/4/23
 **/
public class Test {


    public static void main(String[] args) {

        //在需要将流项目重组成集合时，一般会使用收集器（Stream方法collect
        //的参数）。再宽泛一点来说，但凡要把流中所有的项目合并成一个结果时就可以用。这个结果可以
        //是任何类型，可以复杂如代表一棵树的多级映射，或是简单如一个整数——也许代表了菜单的热
        //量总和。


        //利用counting工厂方法返回的收集器，数一数菜单里有多少
        //种菜：
        long howManyDished = Data.menu.stream().collect(Collectors.counting());

        System.out.println(howManyDished);

        //还可以写得更为直接：

        long howManyDishes_1 = Data.menu.stream().count();

        System.out.println(howManyDishes_1);


        //查找流中的最大值和最小值
        //假设你想要找出菜单中热量最高的菜。你可以使用两个收集器，Collectors.maxBy和
        //Collectors.minBy，来计算流中的最大或最小值。这两个收集器接收一个Comparator参数来
        //比较流中的元素。你可以创建一个Comparator来根据所含热量对菜肴进行比较，并把它传递给
        //Collectors.maxBy

        Comparator<Dish> dishComparator = Comparator.comparing(Dish::getCalories);
        Optional<Dish> most = Data.menu.stream().collect(maxBy(dishComparator));
        System.out.println(most);

        //“要是menu为空
        //怎么办”。那就没有要返回的菜了！Java 8引入了Optional，它是一个容器，可以包含也可以不
        //包含值。这里它完美地代表了可能也可能不返回菜肴的情况。


        //Collectors类专门为汇总提供了一个工厂方法：Collectors.summingInt。它可接受一
        //个把对象映射为求和所需int的函数，并返回一个收集器；该收集器在传递给普通的collect方
        //法后即执行我们需要的汇总操作。举个例子来说，你可以这样求出菜单列表的总热量

        int totalC = Data.menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalC);


        //但汇总不仅仅是求和；还有Collectors.averagingInt，连同对应的averagingLong和
        //averagingDouble可以计算数值的平均数

        double avgC = Data.menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(avgC);

        //想要得到两个或更多这样的
        //结果，而且你希望只需一次操作就可以完成。在这种情况下，你可以使用summarizingInt工厂
        //方法返回的收集器。例如，通过一次summarizing操作你可以就数出菜单中元素的个数，并得
        //到菜肴热量总和、平均值、最大值和最小值：

        IntSummaryStatistics menuS = Data.menu.stream().collect(summarizingInt(Dish::getCalories));

        //这个收集器会把所有这些信息收集到一个叫作IntSummaryStatistics的类里，它提供了
        //方便的取值（getter）方法来访问结果。打印menuStatisticobject会得到输出

        System.out.println(menuS);

        //相应的summarizingLong和summarizingDouble工厂方法有相关的
        // LongSummaryStatistics和DoubleSummaryStatistics类型，适用于收集的属性是原始类型long或
        //double的情况

        //连接字符串
        //joining工厂方法返回的收集器会把对流中每一个对象应用toString方法得到的所有字符
        //串连接成一个字符串。这意味着你把菜单中所有菜肴的名称连接起来，如下所示：

        String shortM = Data.menu.stream().map(Dish::getName).collect(joining());
        System.out.println(shortM);


        //joining在内部使用了StringBuilder来把生成的字符串逐个追加起来。此外还
        //要注意，如果Dish类有一个toString方法来返回菜肴的名称，那你无需用提取每一道菜名称的
        //函数来对原流做映射就能够得到相同的结果


        //该字符串的可读性并不好,joining工厂方法有一个重载版本可以接受元素之间的
        //分界符，这样你就可以得到一个逗号分隔的菜肴名称列表：

        String shortM1 = Data.menu.stream().map(Dish::getName).collect(joining("  ,   "));
        System.out.println(shortM1);






























    }

}
