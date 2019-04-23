package JDK8.stream.partition_demo;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 16:04 2019/4/23
 **/
public class Test {


    public static void main(String[] args) {


        //例如，如果你是素食者或是请了一位素食的朋友来共
        //进晚餐，可能会想要把菜单按照素食和非素食分开：

        Map<Boolean, List<Dish>> partition = Data.menu.stream().collect(partitioningBy(
                Dish::isVegetarian
        ));

        System.out.println(partition);

        System.out.println("===============================================");

        //那么通过Map中键为true的值，就可以找出所有的素食菜肴了：

        List<Dish> vete = partition.get(true);

        System.out.println(vete);

        //用同样的分区谓词，对菜单List创建的流作筛选，然后把结果收集到另外一个List
        //中也可以获得相同的结果：

        List<Dish> vete_1 = Data.menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        System.out.println(vete_1);

        System.out.println("===============================================");


        //分区的好处在于保留了分区函数返回true或false的两套流元素列表。在上一个例子中，要
        //得到非素食Dish的List，你可以使用两个筛选操作来访问partitionedMenu这个Map中false
        //键的值：一个利用谓词，一个利用该谓词的非。而且就像你在分组中看到的，partitioningBy
        //工厂方法有一个重载版本，可以像下面这样传递第二个收集器：

        Map<Boolean,Map<Dish.Type,List<Dish>>> vete_2 = Data.menu.stream()
                .collect(partitioningBy(Dish::isVegetarian,groupingBy(Dish::getType)));

        System.out.println(vete_2);

        //这里，对于分区产生的素食和非素食子流，分别按类型对菜肴分组，得到了一个二级Map，

        System.out.println("===============================================");



        //再举一个例子，你可以重用前面的代码来找到素食和非素
        //食中热量最高的菜：

        Map<Boolean,Dish> mostVet = Data.menu.stream().collect(partitioningBy(Dish::isVegetarian,
                collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));

        System.out.println(mostVet);
























    }
}
