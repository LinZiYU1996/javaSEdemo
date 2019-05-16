package ThinkInJava.Inner_Classes.Reaching_outward_from_a_multiply_nested_class;

/**
 * @Author: Mr.Lin
 * @Description:
 * 一个内部类被嵌套多少层并不重要e_它能透明地访问所有它所嵌入的外围类的所有成 员，
 *
 *
 * @Date: Create in 16:12 2019/5/16
 */
public class MultiNestingAccess {

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }


}
