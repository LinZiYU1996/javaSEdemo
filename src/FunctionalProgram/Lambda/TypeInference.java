package FunctionalProgram.Lambda;


import JDK8.lambda_demo.Functional_interface.predicate_demo.Predicate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *  某些情况下，用户需要手动指明类型，建议大家根据自己或项目组的习惯，采用让代码最
    便于阅读的方法。有时省略类型信息可以减少干扰，更易弄清状况；而有时却需要类型信
    息帮助理解代码。经验证发现，一开始类型信息是有用的，但随后可以只在真正需要时才
    加上类型信息。
 * @Date 10:38 2019/4/27
 **/
public class TypeInference {

    public static void main(String[] args) {

        //使用菱形操作符，根据变量类型做推断


        //们为变量 oldWordCounts ➊明确指定了泛型的类型，而变量 diamondWordCounts ➋则使用了
        //菱形操作符。不用明确声明泛型类型，编译器就可以自己推断出来，这就是它的神奇之处！
        Map<String,Integer> oldW = new HashMap<String,Integer>();
        Map<String,Integer> diamonW = new HashMap<>();


        //类型推断

        Predicate<Integer> atLeast5 = x -> x > 5;
        //Predicate 也是一个 Lambda 表达式，和前文中 ActionListener 不同的是，它还返回一个
        //值。

        //表达式 x > 5 是 Lambda 表达式的主体。这样的情况下，返回值就是
        //Lambda 表达式主体的值


        //略显复杂的类型推断

        BinaryOperator<Long> addLongs = (x,y) -> x + y;

        //类型推断系统相当智能，但若信息不够，类型推断系统也无能为力。类型系统不会漫无边
        //际地瞎猜，而会中止操作并报告编译错误，寻求帮助

        //没有泛型，代码则通不过编译
//        BinaryOperator add = (x, y) -> x + y;



    }

}
