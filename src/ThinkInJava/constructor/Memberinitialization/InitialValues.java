package ThinkInJava.constructor.Memberinitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 类的每个基本类型数据成员保证都会有一个初始值。下面的程序可以验
 *证这类情况，井显示它们的值：
 *
 * @Date: Create in 21:02 2019/4/29
 */
public class InitialValues {


    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printlnInitialValues() {
        System.out.println("Data type Initial value");
        System.out.println("boolean " + t);
        System.out.println("char [" + c + "]");
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
    }
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printlnInitialValues();

    }
}
