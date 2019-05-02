package ThinkInJava.Polymorphism.Inheritance_and_cleanup;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:48 2019/5/2
 */
public class Frog extends Amphibian{

    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog() { System.out.println("Frog()"); }
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();


        //通过组合和继承方法来创建新类时， 永远不必担心对象的渚理问题，
        // 子对象通常都会留给垃圾回收器进行处理。 如果确实遇到清理的问题，
        // 那么必须用心为新类创建disposeO方法（在这里我选用此名称，读者可以提出更好的）。
        // 并且由千继承的缘故，如果我们有其他作为垃圾回收一部分的特殊清理动作，
        // 就必须在导出类中覆盖disposeO方法。 当授盖被继承类的dispose()方法时，
        // 务必记住调用基类版本dispose()方法，否则，基类的清理动作就不会发生。


        //层次结构中的每个类都包含Characteristic和Description这两种类型的成员对象，并且它们
        //也必须被销毁。所以万一某个子对象要依赖千其他对象，销毁的顺序应该和初始化顺序相反。
        //对于字段，则意味着与声明的顺序相反（因为字段的初始化是按照声明的顺序进行的）。对干基
        //类（遵循C++中析构函数的形式），应该首先对其导出类进行清理，然后才是基类。这是因为导
        //出类的清理可能会调用基类中的某些方法，所以需要使基类中的构件仍起作用而不应过早地销
        //毁它们。从输出结果可以看到，Fr哩对象的所有部分都是按照创建的逆序进行销毁的．



    }
}
