package ThinkInJava.ReusingClasses.The_inal_keyword.final_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:21 2019/4/30
 */
public class OverridingPrivate extends WithFinals{

    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
