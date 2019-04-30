package ThinkInJava.ReusingClasses.The_inal_keyword;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 许多编程语言都有某种方法，来向编译器告知一块数据是恒定不变的。有时数据的恒定不变是很有用的，比如：
 *
 * 1.	一个永不改变的编译时常量。
 * 2.	一个在运行时被初始化的值，而你不希望它被改变。
 * 对千编译期常盐这种情况，编译器可以将该常最值代人任何可能用到它的计算式中，也就是说，可以在编译时执行计算式，这减轻了一些运行时的负担。在Java中，这类常扯必须是基
 * 本数据类型，并且以关键字final表示。在对这个常扯进行定义的时候，必须对其进行赋值。
 * 一个既是static又是final的域只占据一段不能改变的存储空间。
 *
 *
 * 当对对象引用而不是基本类型运用final时，其含义会有一点令人迷惑。对千基本类型，
 * final使数值恒定不变｀而用千对象引用, final使引用恒定不变。一旦引用被初始化指向一个对 象
 * ，就无法再把它改为指向另一个对象。然而，对象其自身却是可以被修改的，Java井未提供使任何对象恒定不变的途径
 * （但可以自己编写类以取得使对象恒定不变的效果）。这一限制同样适用数组，它也是对象。
 *
 *
 * @Date: Create in 20:04 2019/4/30
 */
public class FinalData {

    private static Random rand = new Random(47);

    private String id;


    public FinalData(String id) {
        this.id = id;
    }

    // Can be compile-time constants:
    private final int valueOne = 9;

    private static final int VALUE_TWO = 99;

    // Typical public constant:
    public static final int VALUE_THREE = 39;

    // Cannot be compile-time constants:
    private final int i4 = rand.nextInt(20);

    static final int INT_5 = rand.nextInt(20);

    private Value v1 = new Value(11);

    private final Value v2 = new Value(22);

    private static final Value VAL_3 = new Value(33);

    // Arrays:
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }


    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");

        //! fd1.valueOne++; // Error: can’t change value
        fd1.v2.i++; // Object isn’t constant!
        fd1.v1 = new Value(9); // OK -- not final

        for(int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // Object isn’t constant!
        //! fd1.v2 = new Value(0); // Error: Can’t
        //! fd1.VAL_3 = new Value(1); // change reference
        //! fd1.a = new int[3];

        System.out.println(fd1);

        System.out.println("Creating new FinalData");

        FinalData fd2 = new FinalData("fd2");

        System.out.println(fd1);

        System.out.println(fd2);


        //由千valoOne和VAL_T\VO都是带有编译时数值的final基本类型，
        // 所以它们二者均可以用作 编译期常扯，并且没有重大区别。VAL_THREE是一种更加典型的对常量进行定义的方式：
        // 定义为public,则可以被用千包之外，定义为static,则强调只有一份，定义为fmal,则说明它是一 个常址。请注意，
        // 带有恒定初始值（即，编译期常批）的finalstatic基本类型全用大写字母命名， 并且字与字之间用下划线隔开（这就像C常扯一样，C常世是这一命名传统的发源地）。


        //我们不能因为某数据是final的就认为在编译时可以知道它的值。在运行时使用随机生成的
        //数值来初始化i4和INT_S就说明了这一点。示例部分也展示了将final数值定义为静态和非静态的医3
        //区别。此区别只有当数值在运行时内被初始化时才会显现，这是因为编译器对编译时数值

        //同仁（并且它们可能因优化而消失）。当运行程序时就会看到这个区别。诮注意，在fdl和fd2中， 14的值是唯一的，
        // 但INT_S的值是不可以通过创建第二个FinalData对象而加以改变的。这是因为它是static的，在装载时已被初始化，而不是每次创建新对象时都初始化。
        //vl到VAL_3这些变址说明了fmal引用的意义。正如在main()中所看到的，不能因为v2是final 的，就认为无法改变它的值。
        // 由于它是一个引用，final意味着无法将v2再次指向另一个新的对象。这对数组具有同样的意义，数组只不过是另一种引用

    }


}
