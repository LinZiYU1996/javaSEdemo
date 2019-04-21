package JDK8.behavior_parameterization;


import java.util.ArrayList;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 首先实现  从一个列表中筛选绿色苹果的功能
 *
 * @Date 14:58 2019/4/21
 **/
public class demo1 {


    //初试方案
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    //把颜色作为参数的一种方案
    public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    //此时需要考虑苹果的重量这个字段了
    //此时通过简单的复制来实现了功能，只是改变了条件
    //这样做打破了DRY（不要重复自己）的软件工程原则

    //如果你需要通过改变筛选方式来提升性能。那你就得修改所有方法的实现了，而不是只改一个
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if ( apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }




}
