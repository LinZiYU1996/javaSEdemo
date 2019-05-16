package ThinkInJava.Inner_Classes.Usingthisandnew;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 有时你可能想要告知某些其他对象， 去创建其某个内部类的对象。
 * 要实现此目的，你必须在new表达式中提供对其他外部类对象的引用，这是需要使用.ne叶吾法
 *
 *
 * @Date: Create in 11:08 2019/5/16
 */
public class OotNew {

    public class Inner {}

    public static void main(String[] args) {
        OotNew dn = new OotNew();
        OotNew.Inner dni = dn.new Inner();
    }
}
