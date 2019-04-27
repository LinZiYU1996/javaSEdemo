package FunctionalProgram.Lambda;


import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 10:17 2019/4/27
 **/
public class IdentifyLambda {


    public static void main(String[] args) {

        //编写 Lambda 表达式的不同形式

        //Lambda 表达式不包含参数，使用空括号 () 表示没有参数。该 Lambda 表达式
        //实现了 Runnable 接口，该接口也只有一个 run 方法，没有参数，且返回类型为 void。
        Runnable runnable = () -> System.out.println(" Hello");

        //Lambda 表达式包含且只包含一个参数，可省略参数的括号
        ActionListener actionListener = event -> System.out.println("Button");


        //Lambda 表达式的主体不仅可以是一个表达式，而且也可以是一段代码块，使用大括号
        //（{}）将代码块括起来
        //该代码块和普通方法遵循的规则别无二致，可以用返
        //回或抛出异常来退出。只有一行代码的 Lambda 表达式也可使用大括号，用以明确 Lambda
        //表达式从何处开始、到哪里结束
        Runnable runnable1 = () -> {
            System.out.println(" Hello");
            System.out.println(" world");
        };

        //Lambda 表达式也可以表示包含多个参数的方法
        //有必要思考怎样去阅
        //读该 Lambda 表达式。这行代码并不是将两个数字相加，而是创建了一个函数，用来计算
        //两个数字相加的结果。变量 add 的类型是 BinaryOperator<Long>，它不是两个数字的和，
        //而是将两个数字相加的那行代码
        BinaryOperator<Long> add = (x,y) -> x + y;


        //有 Lambda 表达式中的参数类型都是由编译器推断得出的。这当然不错，
        //但有时最好也可以显式声明参数类型，此时就需要使用小括号将参数括起来，多个参数的
        //情况也是如此。
        BinaryOperator<Long> addE = (Long x,Long y) -> x + y;


        //目标类型是指 Lambda 表达式所在上下文环境的类型。比如，将 Lambda 表
        //达式赋值给一个局部变量，或传递给一个方法作为参数，局部变量或方法参
        //数的类型就是 Lambda 表达式的目标类型。






    }
}
