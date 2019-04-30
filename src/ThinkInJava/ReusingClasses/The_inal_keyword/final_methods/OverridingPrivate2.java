package ThinkInJava.ReusingClasses.The_inal_keyword.final_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:22 2019/4/30
 */
public class OverridingPrivate2 extends OverridingPrivate{
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
