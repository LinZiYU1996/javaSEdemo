package ThinkInJava.constructor.staticdatainitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 无论创建多少个对象，静态数据都只占用一份存储区域。static关键字不能应用局部变量
 * 此它只能作用与域。如果一个域是静态的基本类型域，且也没有对它进行初始化，
 * 那么它就会获得基本类型的标准初值1如果它是一个对象引用，那么它的默认初始化值就是null
 * @Date: Create in 21:12 2019/4/29
 */
public class StaticInitialization {

    public static void main(String[] args) {
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    //Bowl类使得看到类的创建，而Table类和Cupboard类在它们的类定义中加入了Bowl类型的静态数据成员。
    // 注意，在静态数据成员定义之前，Cupboard类先定义了一个Bowl类型的非静态数据成员b3。
//    输出可见，静态初始化只有在必要时刻才会进行。如果不创建Table对象，也不引用
//
//    able.bl或Table.b2,那么静态的Bowlbl和b2永远都不会被创建。只有在第一个Table对象被
//    创建（或者第一次访问静态数据）的时候，它们才会被初始化。此后，静态对象不会再次被初匡国始化。
//
//
//
//    初始化的顺序是先静态对象（如果它们尚未因前面的对象创建过程而被初始化），
//    而后是 “非静态”对象。从输出结果中可以观察到这一点。要执行main()(静态方法），
//    必须加载Staticlnitialization类，然后其静态域table和cupboard被初始化，这将导致它们对应的类也被加载，
//    实际情况通常并非如此，因为在典型的程序中，不会像在本例中所做的那样，将所有的事物都通过static联系起来。
//
//
//    总结一下对象的创建过程，假设有个名为Dog的类：
//            1.即使没有显式地使用static关键字，构造器实际上也是静态方法。因此，当首次创建类型
//
//
//    Dog的对象时（构造器可以看成静态方法），或者Dog类的静态方法／静态域首次被访问时， Java解释器必须查找类路径，以定位Dog.class文件。
//            2.然后载入Dog.class(后面会学到，这将创建一个Class对象），有关静态初始化的所有动作都会执行。因此，静态初始化只在Class对象首次加载的时候进行一次。
//
//
//            3.	当用newDogO创建对象的时候，首先将在堆上为Dog对象分配足够的存储空间。
//            4.	这块存储空间会被清零，这就自动地将D哩对象中的所有基本类型数据都设置成了默认值
//    （对数字来说就是0,对布尔型和字符型也相同），而引用则被设置成了null
//      5.	执行所有出现千字段定义处的初始化动作。
//            6.	执行构造器。正如将在第7章所看到的，这可能会牵涉到很多动作，尤其是涉及继承的时候

}
