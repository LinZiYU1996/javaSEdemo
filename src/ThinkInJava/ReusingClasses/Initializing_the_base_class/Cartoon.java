package ThinkInJava.ReusingClasses.Initializing_the_base_class;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 由千现在涉及基类和导出类这两个类，
 * 而不是只有一个类，所以要试着想像导出类所产生 的结果对象，会有点困惑。
 * 从外部来看，它就像是一个与基类具有相同接口的新类，或许还会有一些额外的方法和域。
 * 但继承并不只是复制基类的接口。当创建了一个导出类的对象时，该对象包含了一个基类的子对象。
 * 这个子对象与你用基类直接创建的对象是一样的。二者区别在千，后者来自千外部，而基类的子对象被包装在导出类对象内部。
 *
 *
 * 当然，对基类子对象的正确初始化也是至关重要的，
 * 而且也仅有一种方法来保证这一点：在构造器中调用基类构造器来执行初始化，
 * 而基类构造器具有执行基类初始化所需要的所有知识和能力。Java会自动在导出类的构造器中插人对基类构造器的调用。
 * 下例展示了上述机制在三层继承关系上是如何工作的：
 *
 * @Date: Create in 16:45 2019/4/30
 */
public class Cartoon extends Drawing{

    public Cartoon() { System.out.println("Cartoon constructor"); }


    public static void main(String[] args) {
        Cartoon x = new Cartoon();

        //构建过程是从基类”向外＂扩散的，
        // 所以基类在导出类构造器可以访问它之前，就已经完成了初始化。
        // 即使你不为CartoonO创建构造器，编译器也会为你合成一个默认的构造器，该构造器将调用基类的构造器

    }

}
