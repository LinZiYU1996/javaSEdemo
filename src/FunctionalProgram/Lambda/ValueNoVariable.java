package FunctionalProgram.Lambda;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
*
 * @Author Mr.Lin
 * @Description //
 * 引用值，而不是变量
 * @Date 10:30 2019/4/27
 **/
public class ValueNoVariable {


    public static void main(String[] args) {

        //使用过匿名内部类，也许遇到过这样的情况：需要引用它所在方法里的变量。这
        //时，需要将变量声明为 final，
        //将变量声明为 final，意味着不能为其重复赋
        //值。同时也意味着在使用 final 变量时，实际上是在使用赋给该变量的一个特定的值。


        //匿名内部类中使用 final 局部变量
        Button button = new Button();
        final String name = "g";

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(name);
            }
        });

        //Java 8 虽然放松了这一限制，可以引用非 final 变量，但是该变量在既成事实上必须是
        //final。虽然无需将变量声明为 final，但在 Lambda 表达式中，也无法用作非终态变量。如
        //果坚持用作非终态变量，编译器就会报错。


        //既成事实上的 final 是指只能给该变量赋值一次。换句话说，Lambda 表达式引用的是值，
        //而不是变量。


        String name_ = "g";
        button.addActionListener(event -> System.out.println("hi " + name_));

        //final 就像代码中的线路噪声，省去之后代码更易读。当然，有些情况下，显式地使用 final
        //代码更易懂。是否使用这种既成事实上的 final 变量，完全取决于个人喜好。
        //如果你试图给该变量多次赋值，然后在 Lambda 表达式中引用它，编译器就会报错。

//        未使用既成事实上的 final 变量，导致无法通过编译


//        String name__ = "g";
//        name__ = "a";
//        button.addActionListener(event -> System.out.println("hi " + name__));  //出错

        //这种行为也解释了为什么 Lambda 表达式也被称为闭包。未赋值的变量与周边环境隔离起
        //来，进而被绑定到一个特定的值。




    }

}
