package ThinkInJava.constructor.staticdatainitialization.Explicitstaticinitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:22 2019/4/29
 */
public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }

    // static Cups cups1 = new Cups(); // (2)
    // static Cups cups2 = new Cups(); // (2)

    //无论是通过标为(1)的那行代码访问静态的cupl对象，还是把标为(1)的行注释掉，让它去运行

    //标为(2)的那行代码（即解除标为(2)的行的注释），Cups的静态初始化动作都会得到执行。 如果把标为(1)和(2)的行同时注释掉，Cups的静态初始化动作就不会进行，就像在输出中看到的那样。此外，激活一行还是两行标为(2)的代码（即解除注释）都无关紧要，静态初始化动作只进行一次。


}
