package ThinkInJava.constructor.Variableargumentlists;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 这个程序还展示了你可以如何使用具有Object之外类型的可变参数列表。
 * 这里所有的可变参数都必须是String对象。在可变参数列表中可以使用任何类型的参数，
 * 包括基本类型
 *
 * @Date: Create in 21:45 2019/4/29
 */
public class OptionalTrailingArguments {

    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for(String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }


}
