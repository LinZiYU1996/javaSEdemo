package FunctionalProgram.Lambda;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:12 2019/4/27
 **/
public class FirstUse {


    public static void main(String[] args) {

        //Swing 是一个与平台无关的 Java 类库，用来编写图形用户界面（GUI）。该类库有一个常见
        //用法：为了响应用户操作，需要注册一个事件监听器。用户一输入，监听器就会执行一些
        //操作
        Button button = new Button();

        //使用匿名内部类将行为和按钮单击进行关联

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("button clicked");
            }
            //样板代码并不是唯一的问题：这些代码还相当难读，因为它没有清楚地表达程
            //序员的意图。我们不想传入对象，只想传入行为。
        });


        //使用 Lambda 表达式将行为和按钮单击进行关联

        //传入了一段代码块——一个没有名字的函数。
        //event 是参数名，和上面匿名内部类示例中的是同一个参数。-> 将参数和 Lambda 表达式
        //的主体分开，而主体是用户点击按钮时会运行的一些代码。
        button.addActionListener(event -> System.out.println("button clicked"));

        //和使用匿名内部类的另一处不同在于声明 event 参数的方式。使用匿名内部类时需要显式
        //地声明参数类型 ActionEvent event，而在 Lambda 表达式中无需指定类型，程序依然可以
        //编译。这是因为 javac 根据程序的上下文（addActionListener 方法的签名）在后台推断出
        //了参数 event 的类型。这意味着如果参数类型不言而明，则无需显式指定





    }

}
