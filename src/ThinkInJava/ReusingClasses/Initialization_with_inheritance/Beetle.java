package ThinkInJava.ReusingClasses.Initialization_with_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在Beetle上运行Java时，所发生的第一件事情就是试图访间Beetle.mainO(一个static方法），
 *
 * 千是加载器开始启动并找出Beetle类的编译代码（在名为Beetle.class的文件之中）。在对它进行加载的过程中，编译器注意到它有一个基类
 * （这是由关键字extends得知的），千是它继续进行加 载。不管你是否打算产生一个该基类的对象，这都要发生（请尝试将对象创建代码注释掉，以证明这一点）。
 * 如果该基类还有其自身的基类，那么第二个基类就会被加载，如此类推。接下来，根基类 中的static初始化（在此例中为Insect)即会被执行，
 * 然后是下一个导出类，以此类推。这种方式很重要，因为导出类的static初始化可能会依赖千基类成员能否被正确初始化。
 * 至此为止，必要的类都已加载完毕，对象就可以被创建了。首先，对象中所有的基本类型都会被设为默认值
 * ，对象引用被设为null----i!是通过将对象内存设为二进制零值而一举生成的。然后，基类的构造器会被调用。在本例中，它是被自动调用的
 * 。但也可以用super来指定对基类构造器的调用（正如在Beetle()构造器中的第一步操作）。基类构造器和导出类的构造器一样，以相同的顺序来经历相同的过程。
 * 在基类构造器完成之后，实例变址按其次序被初始化。最后，构造器的其余部分被执行。
 * @Date: Create in 20:48 2019/4/30
 */
public class Beetle extends Insect{

    private int k = printlnInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printlnInit("static Beetle.x2 initialized");


    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
