package JDK8.stream.demo1.demo2;


import JDK8.stream.demo1.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 为了搞清楚流水线中到底发生了什么，我们把代码改一改，让每个Lambda都打印出当前处
理的菜肴（就像很多演示和调试技巧一样，这种编程风格要是搁在生产代码里那就吓死人了，但
是学习的时候却可以直接看清楚求值的顺序）
 * @Date 21:37 2019/4/21
 **/
public class Test {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
         new Dish("pork", false, 800, Dish.Type.MEAT),
         new Dish("beef", false, 700, Dish.Type.MEAT),
         new Dish("chicken", false, 400, Dish.Type.MEAT),
         new Dish("french fries", true, 530, Dish.Type.OTHER),
         new Dish("rice", true, 350, Dish.Type.OTHER),
         new Dish("season fruit", true, 120, Dish.Type.OTHER),
         new Dish("pizza", true, 550, Dish.Type.OTHER),
         new Dish("prawns", false, 300, Dish.Type.FISH),
         new Dish("salmon", false, 450, Dish.Type.FISH) );


        List<String> names =
                menu.stream()
                        .filter(d -> {
                            System.out.println("filtering" + d.getName());
                            return d.getCalories() > 300;
                        })
                        .map(d -> {
                            System.out.println("mapping" + d.getName());
                            return d.getName();
                        })
                        .limit(3)
                        .collect(toList());
        System.out.println(names);


        //有好几种优化利用了流的延迟性质。第一，尽管很多菜的热量都高于300卡路里，
        //但只选出了前三个！这是因为limit操作和一种称为短路的技巧，我们会在下一章中解释。第二，
        //尽管filter和map是两个独立的操作，但它们合并到同一次遍历中了（我们把这种技术叫作循环
        //合并）
    }


}
