package JDK8.refactoringAnddebugging;


import JDK8.stream.demo1.Dish;
import JDK8.stream.dividing.CalLevel;
import JDK8.stream.screeningAndslicing.Data;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 从 Lambda 表达式到方法引用的转换
 *
 * @Date 15:19 2019/4/24
 **/
public class LamdbaToReference {




    public static void main(String[] args) {

        //Lambda表达式非常适用于需要传递代码片段的场景。不过，为了改善代码的可读性，也请
        //尽量使用方法引用。因为方法名往往能更直观地表达代码的意图。下面代码的功能是按照食物的热量级别对菜肴进行分类：

        Map<CalLevel, List<Dish>> dishByCal = Data.menu.stream()
                .collect(groupingBy(
                        dish -> {
                            if (dish.getCalories() <= 400 ) return CalLevel.DIET;
                            else  if (dish.getCalories() <= 700) return CalLevel.NORMAL;
                            else return CalLevel.FAT;
                        }
                ));



        //你可以将Lambda表达式的内容抽取到一个单独的方法中，将其作为参数传递给groupingBy
        //方法。变换之后，代码变得更加简洁，程序的意图也更加清晰了：

        Map<CalLevel,List<Dish>> dishByCall = Data.menu.stream()
                .collect(groupingBy(Dish::getCaloricLevel));  //将 Lambda 表达式抽取到一个方法内



        //使用Collectors接口可以轻松得到和或者最大值，与采
        //用Lambada表达式和底层的归约操作比起来，这种方式要直观得多。与其编写

        int totalC = Data.menu.stream()
                .map(Dish::getCalories).reduce(0,(c1,c2) -> c1 + c2);

        //不如尝试使用内置的集合类，它能更清晰地表达问题陈述是什么。下面的代码中，我们使用了集
        //合类summingInt（方法的名词很直观地解释了它的功能）：

        int totalCC = Data.menu.stream()
                .collect(summingInt(Dish::getCalories));




    }


}
