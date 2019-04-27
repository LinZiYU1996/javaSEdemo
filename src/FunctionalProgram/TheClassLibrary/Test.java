package FunctionalProgram.TheClassLibrary;


/*
*
 * @Author Mr.Lin
 * @Description // 基本类型
 * @Date 12:12 2019/4/27
 **/
public class Test {


    public static void main(String[] args) {


        //Java 的泛型是基于对泛型参数类型的擦除——换句话说，假设它是 Object 对象的实例——
        //因此只有装箱类型才能作为泛型参数。这就解释了为什么在 Java 中想要一个包含整型值的
        //列表 List<int>，实际上得到的却是一个包含整型对象的列表 List<Integer>。


        //由于装箱类型是对象，因此在内存中存在额外开销。比如，整型在内存中占用
        //4 字节，整型对象却要占用 16 字节。这一情况在数组上更加严重，整型数组中的每个元素
        //只占用基本类型的内存，而整型对象数组中，每个元素都是内存中的一个指针，指向 Java
        //堆中的某个对象。在最坏的情况下，同样大小的数组，Integer[] 要比 int[] 多占用 6 倍
        //内存


        //在 Java 8 中，仅对整型、
        //长整型和双浮点型做了特殊处理，因为它们在数值计算中用得最多，特殊处理后的系统性
        //能提升效果最明显


        //对基本类型做特殊处理的方法在命名上有明确的规范。如果方法返回类型为基本类型，则
        //在基本类型前加 To，如 ToLongFunction。如果参数是基本类型，则不加前缀只
        //需类型名即可，如 LongFunction。如果高阶函数使用基本类型，则在操作后加
        //后缀 To 再加基本类型，如 mapToLong。


        //这些基本类型都有与之对应的 Stream，以基本类型名为前缀，如 LongStream。事实上，
        //mapToLong 方法返回的不是一个一般的 Stream，而是一个特殊处理的 Stream。在这个特
        //殊的 Stream 中，map 方法的实现方式也不同，它接受一个 LongUnaryOperator 函数，将
        //一个长整型值映射成另一个长整型值，通过一些高阶函数装箱方法，如
        //mapToObj，也可以从一个基本类型的 Stream 得到一个装箱后的 Stream，如 Stream<Long>




    }


}
