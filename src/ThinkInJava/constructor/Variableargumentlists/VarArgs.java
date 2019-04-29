package ThinkInJava.constructor.Variableargumentlists;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:40 2019/4/29
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});


        //有了可变参数，就再也不用显式地编写数组语法了，
        // 当你指定参数时，编译器实际上会为你去填充数组。
        // 你获取的仍旧是一个数组，这就是为什么print()可以使用foreach来迭代该数组的原因。
        // 但是，这不仅仅只是从元素列表到数组的自动转换，请注意程序中倒数第二行，一个Integer数组
        // （通过使用自动包装而创建的）被转型为一个Object数组（以便移除编译器警告信息）
        // ，并且传递给了printArray()。很明显，编译器会发现它已经是一个数组了，
        // 所以不会在其 上执行任何转换。因此，如果你有一组事物，可以把它们当作列表传递，
        // 而如果你已经有了一个数组，该方法可以把它们当作可变参数列表来接受。
    }
}
