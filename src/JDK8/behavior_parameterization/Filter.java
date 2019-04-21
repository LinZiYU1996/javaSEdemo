package JDK8.behavior_parameterization;


import java.util.ArrayList;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *根据抽象条件进行筛选
 *
 * @Date 15:14 2019/4/21
 **/
public class Filter {

    //filterApples 方法的行为取决于通过ApplePredicate 对象传递的代码，也就是把filterApples 方法的行为参数化了
    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (p.test(apple)) { //这里 谓词对象封装了测试苹果的条件
                result.add(apple);
            }
        }
        return result;
    }







    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        List<Apple> redAndHeavyApples = filterApples(apples,new AppleRedAndHeavyPredicate());


        //用Lambda表达式重写为下面的样子
        List<Apple> result = filterApples(apples,(Apple a) -> "red".equals(a.getColor()));
    }

}
