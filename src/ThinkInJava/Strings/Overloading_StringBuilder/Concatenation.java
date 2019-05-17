package ThinkInJava.Strings.Overloading_StringBuilder;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 可以想象一下，这段代码可能是这样工作的：
 * String可能有一个appendO方法，它会生成一个新的String对象，
 * 以包含 "abc" 与mango连接后的字符串。 然后，该对象再与 "def" 相连
 * ，生成 另一个新的String对象，
 * 依此类推。
 * 这种工作方式当然也行得通，但是为了生成最终的String,
 * 此方式会产生一大堆蒂要垃圾回收的中间对象。 我猜想，
 * Java设计师一开始就是这么做的（这也是软件设计中的一个教训：
 * 除非你用代码将系统实现，并让它动起来， 否则你无法真正了解它会有什么问题），
 * 然后他们发现其性能相当糟糕。
 *
 * @Date: Create in 11:40 2019/5/17
 */
public class Concatenation {

    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }


}
