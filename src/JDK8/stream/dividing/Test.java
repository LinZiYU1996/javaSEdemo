package JDK8.stream.dividing;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.*;

import static java.util.stream.Collectors.*;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 11:07 2019/4/23
 **/
public class Test {


    public static void main(String[] args) {

        //把菜单中的菜按照类型进行分类，
        //有肉的放一组，有鱼的放一组，其他的都放另一组。用Collectors.groupingBy工厂方法返回
        //的收集器就可以轻松地完成这项任务，

        Map<Dish.Type, List<Dish>> dishByType = Data.menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishByType);

        System.out.println("=====================================");

        //给groupingBy方法传递了一个Function（以方法引用的形式），它提取了流中每
        //一道Dish的Dish.Type。我们把这个Function叫作分类函数，因为它用来把流中的元素分成不
        //同的组。
        //分组操作的结果是一个Map，把分组函数返回的值作为映射的键，把流中
        //所有具有这个分类值的项目的列表作为对应的映射值。在菜单分类的例子中，键就是菜的类型，


        //分类函数不一定像方法引用那样可用，因为你想用以分类的条件可能比简单的属性访
        //问器要复杂。例如，你可能想把热量不到400卡路里的菜划分为“低热量”（diet），热量400到700
        //卡路里的菜划为“普通”（normal），高于700卡路里的划为“高热量”（fat）。由于Dish类的作者
        //没有把这个操作写成一个方法，你无法使用方法引用，但你可以把这个逻辑写成Lambda表达式

        Map<CalLevel,List<Dish>> dishLevel = Data.menu.stream().collect(groupingBy(dish ->
        {
            if (dish.getCalories() <= 400) return CalLevel.DIET;
            else if (dish.getCalories() <= 700) return CalLevel.NORMAL;
            else  return CalLevel.FAT;
        }));

        System.out.println(dishLevel);
        System.out.println("=====================================");

        //多级分组
        //要实现多级分组，我们可以使用一个由双参数版本的Collectors.groupingBy工厂方法创
        //建的收集器，它除了普通的分类函数之外，还可以接受collector类型的第二个参数。那么要进
        //行二级分组的话，我们可以把一个内层groupingBy传递给外层groupingBy，并定义一个为流
        //中项目分类的二级标准，

        Map<Dish.Type,Map<CalLevel,List<Dish>>> dishByL = Data.menu.stream().
                collect(groupingBy(Dish::getType,
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CalLevel.DIET;
                            else if (dish.getCalories() <= 700) return CalLevel.NORMAL;
                            else return CalLevel.FAT;
                        })));
        System.out.println(dishByL);

        //这里的外层Map的键就是第一级分类函数生成的值：“fish, meat, other”，而这个Map的值又是
        //一个Map，键是二级分类函数生成的值：“normal, diet, fat”。最后，第二级map的值是流中元素构
        //成的List，是分别应用第一级和第二级分类函数所得到的对应第一级和第二级键的值：“salmon、
        //pizza…”这种多级分组操作可以扩展至任意层级，n级分组就会得到一个代表n级树形结构的n级
        //Map。

        System.out.println("=====================================");

        //按子组收集数据
        //例如，要数一数菜单中每类菜有多少个，可以传递counting收集器作为
        //groupingBy收集器的第二个参数

        Map<Dish.Type,Long> typeC = Data.menu.stream().collect(groupingBy(Dish::getType,counting()));
        System.out.println(typeC);


        //再举一个例子，你可以把前面用于查找菜单中热量最高的菜肴的收集器改一改，按照菜的类
        //型分类：

        Map<Dish.Type, Optional<Dish>> mostC = Data.menu.stream().collect(groupingBy(Dish::getType
        ,maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(mostC);

        //这个分组的结果显然是一个map，以Dish的类型作为键，以包装了该类型中热量最高的Dish
        //的Optional<Dish>作为值：

        System.out.println("=====================================");


        //更一般地来说，把收集器返回的结果转换为另一种类型，你可以使用
        //Collectors.collectingAndThen工厂方法返回的收集器

        Map<Dish.Type,Dish> mostC_1 = Data.menu.stream().collect(groupingBy(Dish::getType,
                collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)),Optional::get)));

        System.out.println(mostC_1);


        //这个工厂方法接受两个参数——要转换的收集器以及转换函数，并返回另一个收集器。这个
        //收集器相当于旧收集器的一个包装，collect操作的最后一步就是将返回值用转换函数做一个映
        //射。在这里，被包起来的收集器就是用maxBy建立的那个，而转换函数Optional::get则把返
        //回的Optional中的值提取出来。前面已经说过，这个操作放在这里是安全的，因为reducing
        //收集器永远都不会返回Optional.empty()。


        //一般来说，通过groupingBy工厂方法的第二个参数传递的收集器将会对分到同一组中的所
        //有流元素执行进一步归约操作。例如，你还重用求出所有菜肴热量总和的收集器，不过这次是对
        //每一组Dish求和：

        System.out.println("=====================================");

        Map<Dish.Type,Integer> totalC = Data.menu.stream().collect(groupingBy(Dish::getType,summingInt(Dish::getCalories)));
        System.out.println(totalC);



        System.out.println("=====================================");

        //常常和groupingBy联合使用的另一个收集器是mapping方法生成的。这个方法接受两
        //个参数：一个函数对流中的元素做变换，另一个则将变换的结果对象收集起来。其目的是在累加
        //之前对每个输入元素应用一个映射函数，这样就可以让接受特定类型元素的收集器适应不同类型
        //的对象。我们来看一个使用这个收集器的实际例子。比方说你想要知道，对于每种类型的Dish，
        //菜单中都有哪些CaloricLevel。我们可以把groupingBy和mapping收集器结合起来，如下所示

        Map<Dish.Type, Set<CalLevel>> calByType = Data.menu.stream().collect(groupingBy(
                Dish::getType,mapping(
                        dish -> {
                            if (dish.getCalories() <= 400) return CalLevel.DIET;
                            else  if (dish.getCalories() <= 700) return CalLevel.NORMAL;
                            else return CalLevel.FAT;
                        },
        toSet()        )
        ));

        System.out.println(calByType);

        //传递给映射方法的转换函数将Dish映射成了它的
        //CaloricLevel：生成的CaloricLevel流传递给一个toSet收集器，它和toList类似，不过是
        //把流中的元素累积到一个Set而不是List中，以便仅保留各不相同的值




















    }
}
