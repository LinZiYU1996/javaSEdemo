package JDK8.stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 20:58 2019/4/21
 **/
public class Test1 {

    public static void main(String[] args) {
        //下面两段代码都是用来返回低热量的菜肴名称的，
        //并按照卡路里排序，一个是用Java 7写的，另一个是用Java 8的流写的
        //在这段代码中，你用了一个“垃圾变量”dishes。它唯一的作用就是作为一次
        //性的中间容器
        List<Dish> dishes = new ArrayList<>();
        List<Dish> menu = new ArrayList<>();
        for(Dish d: menu){
            if(d.getCalory() < 400){
                dishes.add(d);
            }
        }
        Collections.sort(dishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2){
                return Integer.compare(d1.getCalory(), d2.getCalory());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish d: dishes){
            lowCaloricDishesName.add(d.getName());
        }


        //Java8 实现
        List<String> lowCaloricDishesName_1 =
                menu.stream()
                        .filter(d -> d.getCalory() < 400)
                        .sorted(comparing(Dish::getCalory))
                        .map(Dish::getName)
                        .collect(toList());



        //为了利用多核架构并行执行这段代码，你只需要把stream()换成parallelStream()
        List<String> lowCaloricDishesName_2 =
                menu.parallelStream()
                        .filter(d -> d.getCalory() < 400)
                        .sorted(comparing(Dish::getCalory))
                        .map(Dish::getName)
                        .collect(toList());


    }


}
