package ThinkInJava.ReusingClasses.The_inal_keyword.final_arguments;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * Java允许在参数列表中以声明的方式将参数指明为final。这意味谙你无法在方法中更改参数引用所指向的对象：
 *
 *
 * @Date: Create in 20:15 2019/4/30
 */
public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo(); // Illegal -- g is final
    }


    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }


    // void f(final int i) { i++; } // Can’t change
    // You can only read from a final primitive:
    int g(final int i) { return i + 1; }


    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();

        bf.without(null);
        bf.with(null);
    }
}
