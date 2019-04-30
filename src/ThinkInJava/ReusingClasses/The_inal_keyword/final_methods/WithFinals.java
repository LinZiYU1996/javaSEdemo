package ThinkInJava.ReusingClasses.The_inal_keyword.final_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:21 2019/4/30
 */
public class WithFinals {
    // Identical to "private" alone:
    private final void f() { System.out.println("WithFinals.f()"); }


    // Also automatically "final":
    private void g() { System.out.println("WithFinals.g()"); }


}
