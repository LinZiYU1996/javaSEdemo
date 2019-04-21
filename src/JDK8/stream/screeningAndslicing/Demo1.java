package JDK8.stream.screeningAndslicing;

import JDK8.stream.demo1.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 22:21 2019/4/21
 **/
public class Demo1 {


    public static void main(String[] args) {


        //Streams接口支持filter方法（你现在应该很熟悉了）。该操作会接受一个谓词（一个返回
        //boolean的函数）作为参数，并返回一个包括所有符合谓词的元素的流。例如，你可以像图5-1
        //所示的这样，筛选出所有素菜，创建一张素食菜单：
        List<Dish> vegetarianMenu = Data.menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());
        System.out.println(vegetarianMenu);

        System.out.println("========================================");

        //流还支持一个叫作distinct的方法，它会返回一个元素各异（根据流所生成元素的
        //hashCode和equals方法实现）的流。例如，以下代码会筛选出列表中所有的偶数，并确保没有
        //重复
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8,9,2,2,8,8);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);


        System.out.println("========================================");


        //流支持limit(n)方法，该方法会返回一个不超过给定长度的流。所需的长度作为参数传递
        //给limit。如果流是有序的，则最多会返回前n个元素。比如，你可以建立一个List，选出热量
        //超过300卡路里的头三道菜：
        List<Dish> dishes = Data.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList());
        System.out.println(dishes);

        System.out.println("========================================");


        //流还支持skip(n)方法，返回一个扔掉了前n个元素的流。如果流中元素不足n个，则返回一
        //个空流。请注意，limit(n)和skip(n)是互补的！例如，下面的代码将跳过超过300卡路里的头
        //两道菜，并返回剩下的
        List<Dish> dishes1 = Data.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList());
        System.out.println(dishes1);


    }
}
