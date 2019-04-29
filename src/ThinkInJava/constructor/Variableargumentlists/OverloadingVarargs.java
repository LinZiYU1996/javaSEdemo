package ThinkInJava.constructor.Variableargumentlists;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:49 2019/4/29
 */
public class OverloadingVarargs {

    static void f(Character... args) {
        System.out.print("first");
        for(Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }
    static void f(Integer... args) {
        System.out.print("second");
        for(Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }
    static void f(Long... args) {
        System.out.println("third");
    }
    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        //! f(); // Won’t compile -- ambiguous

        //在每一种情况中，编译器都会使用自动包装机制来匹配重载的方法，然后调用最明确匹配的方法。
        //但是在不使用参数调用f()时，编译器就无法知道应该调用哪一个方法了。
        // 尽管这个错误可以弄清楚，但是它可能会使客户端程序员大感意外。
    }
}
