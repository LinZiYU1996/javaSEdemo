package JDK8.behavior_parameterization.test2_1;


import JDK8.behavior_parameterization.Apple;

import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 *现在你就可以给prettyPrintApple方法传递多种行为了。为此，你首先要实
例化AppleFormatter的实现，然后把它们作为参数传给prettyPrintApple：
prettyPrintApple(inventory, new AppleFancyFormatter());
这将产生一个类似于下面的输出：
A light green apple
A heavy red apple
…
或者试试这个：
prettyPrintApple(inventory, new AppleSimpleFormatter());
这将产生一个类似于下面的输出：
An apple of 80g
An apple of 155g
 * @Date 15:31 2019/4/21
 **/
public class Test {


    //prettyPrintApple方法接受AppleFormatter对象，并在内部使用
    //它们。你可以给prettyPrintApple加上一个参数
    public static  void  prettyPrintApple(List<Apple> inventory,AppleFormatter appleFormatter){
        for(Apple apple : inventory){
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }
}
