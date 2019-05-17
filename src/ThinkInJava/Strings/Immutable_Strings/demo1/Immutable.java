package ThinkInJava.Strings.Immutable_Strings.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 当把q传给upcaseo方法时，实际传递的是引用的一个拷贝。其实
 * ，每当把String对象作为方法 的参数时，都会复制一份引用，
 * 而该引用所指的对象其实一直待在单一的物理位置上，
 * 从未动过。
 * 回到upcaseO的定义，传人其中的引用有了名字S,只有upcase()运行的时候，
 * 局部引用S才存在。一且upcase()运行结束，s就消失了。当然了，upcase()的返回值，
 * 其实只是最终结果的引用。这足以说明，upcaseO返回的引用已经指向了一个新的对象，
 * 而原本的q则还在原地。
 * @Date: Create in 11:34 2019/5/17
 */
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }
    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q); // howdy
        String qq = upcase(q);
        System.out.println(qq); // HOWDY
        System.out.println(q); // howdy
    }


}
