package ThinkInJava.Type_Information.The_Class_object.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * FancyToy继承自Toy并实现了HasBatteries
 * Waterproo优Shoots接口。在main()中，用
 *
 * forNameO方法在适当的try语句块中，创建了一个Class引用
 * ，井将其初始化为指向FancyToy Class。注意，在传递给forNameO的字符串中
 * ，你必须使用全限定名（包含包名）。
 *
 *
 *printlnfo()使用getName()来产生全限定的类名，
 * 并分别使用getSiinpleName()和 getCanonicalName()
 * (在Ja俨vaSES中引入的）来产茬习不含包名的类名和全限定的类名。
 * islnterfaceO方法如同其名，可以告诉你这个Class对象是否表示某个接口。
 * 因此，通过Class对 象，你可以发现你想要了解的类型的所有信息。
 *
 * main()中调用的Class.getlnterfaces()方法返回的是Class对象，
 * 它们表示在感兴趣的Class 对象中所包含的接口。
 * 如果你有一个Class对象，还可以使用getSuperclassO方法查询其直接基类，
 * 这将返回你可以用来进一步查询的Class对象。因此，你可以在运行时发现一个对
 * 象完整的类继承结构。
 * Class的newInstance()方法是实现“虚拟构造器”的一种途径，虚拟构造器允许你声明：
 * “我不知道你的确切类型，但是无论如何要正确地创建你自己。”在前面的示例中，
 *
 * 仅仅只是 一个Class引用，在编译期不具备任何更进一步的类型信息。
 * 当你创建新实例时，会得到Object 引用，
 * 但是这个引用指向的是Toy对象。当然，在你可以发送Object能够接受的消息之外的任何
 *
 * @Date: Create in 16:53 2019/5/18
 */
public class FancyToy implements HasBatteries, Waterproof, Shoots{

    FancyToy() { super(); }


}
