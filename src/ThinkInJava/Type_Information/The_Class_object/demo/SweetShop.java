package ThinkInJava.Type_Information.The_Class_object.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 这里的每个类Candy、 Gum和Cookie, 都有一个static子句，
 * 该子句在类第一次被加载时执行。这时会有相应的信息打印出来，
 * 告诉我们这个类什么时候被加载了。在main()中， 创建对象的代码被置于打印语句之间，
 * 以帮助我们判断加载的时间点。
 *
 *
 * 从输出中可以看到， Class对象仅在需要的时候才被加载，
 * static初始化是在类加载时进行的。特别有趣的一行是：
 * Class.forName("Gum");
 *
 * 这个方法是Class类（所有Class对象都属于这个类） 的一个static成员。Class对象就和其他
 *
 *
 * 对象一样， 我们可以获取并操作它的引用（这也就是类加载器的工作）。
 * forName()是取得Class 对象的引用的一种方法。它是用一个包含目标类的文本名
 * （注意拼写和大小写）的String作输人参数， 返回的是一个Class对象的引用，
 * 上面的代码忽略了返回值。对forNameO的调用是为了它产生的 ＂副作用”：
 * 如果类Gum还没有被加载就加载它。在加载的过程中， Gum的static子旬被执行。
 *
 *
 *在前面的例子里，如果Class.forName()找不到你要加载的类，
 *  它会抛出异常ClassNot­FoundException。这里我们只蒂简单报告问题，
 *  但在更严密的程序里， 可能要在异常处理程序中解决这个问题。
 *
 *
 *无论何时， 只要你想在运行时使用类型信息， 就必须首先获得对恰当的Class对象的引用。
 * Class.forN ame()就是实现此功能的便捷途径， 因为你不需要为了获得Class引用而持有该类型的对象
 * 。但是， 如果你已经拥有了一个感兴趣的类型的对象， 那就可以通过调用getClassO方法来
 * 获取Class引用了， 这个方法属千根类Object的一部分，
 * 它将返回表示该对象的实际类型的Class 引用。Class包含很多有用的方法，
 * 下面是其中的一部分：
 *
 *
 *
 *
 *
 *
 * @Date: Create in 11:34 2019/5/18
 */
public class SweetShop {

    public static void main(String[] args) {


        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn’t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }


}
