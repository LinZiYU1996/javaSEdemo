package JDK8.findAndmatch_demo;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 9:57 2019/4/22
 **/
public class Test1 {


    public static void main(String[] args) {

        //findAny方法将返回当前流中的任意元素。它可以与其他流操作结合使用。比如，你可能想
        //找到一道素食菜肴。你可以结合使用filter和findAny方法来实现这个查询


        //流水线将在后台进行优化使其只需走一遍，并在利用短路找到结果时立即结束。不过慢着，
        //代码里面的Optional是个什么玩意儿？

        //Optional<T>类（java.util.Optional）是一个容器类，代表一个值存在或不存在。在
        //上面的代码中，findAny可能什么元素都没找到。Java 8的库设计人员引入了Optional<T>，这
        //样就不用返回众所周知容易出问题的null了


        Optional<Dish> dish = Data.menu.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        System.out.println("============================================");


        //有些流有一个出现顺序（encounter order）来指定流中项目出现的逻辑顺序（比如由List或
        //排序好的数据列生成的流）。对于这种流，你可能想要找到第一个元素。为此有一个findFirst
        //方法，它的工作方式类似于findany。例如，给定一个数字列表，下面的代码能找出第一个平方
        //能被3整除的数
        List<Integer> someNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
                                                            .map(x -> x * x)
                                                            .filter(x -> x % 3 == 0)
                                                            .findFirst();
        System.out.println(firstSquareDivisibleByThree);


    }


}
