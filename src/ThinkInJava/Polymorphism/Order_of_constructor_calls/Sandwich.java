package ThinkInJava.Polymorphism.Order_of_constructor_calls;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:36 2019/5/2
 */
public class Sandwich extends PortableLunch{


    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() { System.out.println("Sandwich()"); }
    public static void main(String[] args) {
        new Sandwich();

        //在这个例子中，用其他类创建了一个复杂的类，而且每个类都有一个声明它自己的构造器。

        //其中最重要的类是Sandwich,它反映了三层继承（若将自Object的隐含继承也算在内，就是四层）
        // 以及三个成员对象。当在mainO里创建一个Sandwich对象后，就可以看到输出结果。这也回表明了这一复杂对象调用构造器要遵照下面的顺序：

        //1)调用基类构造器。 这个步骤会不断地反复递归下去，首先是构造这种层次结构的根，然后是下一层导出类，等等， 直到最低层的导出类。

        //2)	按声明顺序调用成员的初始化方法。

        //调用导出类构造器的主体。

        //
    }


    //基类的构造器总是在导出类的构造过程中被调用，而且按照继承层次逐渐向上链接，以使每个基类的构造器都能得到调用。
    // 这样做是有意义的，因为构造器具有一项特殊任务：检查对象是否被正确地构造。导出类只能访间它自己的成员，不能访问基类中的成员（
    // 基类成员通常
    //是private类型）。只有基类的构造器才具有恰当的知识和权限来对自己的元素进行初始化。因此， 必须令所有构造器都得到调用，
    // 否则就不可能正确构造完整对象。这正是编译器为什么要强制每个导出类部分都必须调用构造器的原因。在导出类的构造器主体中，
    // 如果没有明确指定调用某个基类构造器，它就会“默默“地调用默认构造器。如果不存在默认构造器，编译器就会报错（若某个类没有构造器，
    // 编译器会自动合成出一个默认构造器）。



}
