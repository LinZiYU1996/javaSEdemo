package ThinkInJava.Type_Information.instanceof_Class_equivalence.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * test()方法使用了两种形式的instanceof作为参数来执行类型检查。
 * 然后获取Class引用，并用＝和equal的来检查Class对象是否相等。
 * 使人放心的是，instanco杆日islnstanceO生成的结果完全一样，equals()和＝＝也一样。
 * 但是这两组测试得出的结论却不相同。 instanceof保持了类型的概念，它指的是 “你是这个类吗，
 * 或者你是这个类的派生类吗？ ” 而如果用＝＝比较实际的Class
 *对象，就没有考虑继承一一它或者是这个确切的类型，或者不是．
 *
 *
 *
 *
 * @Date: Create in 10:08 2019/5/19
 */
public class FamilyVsExactType {

    static void test(Object x) {
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Derived "+ (x instanceof Derived));
        System.out.println("Base.isInstance(x) "+ Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class)) "+
                (x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class)) " +
                (x.getClass().equals(Derived.class)));
    }


    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }


}
