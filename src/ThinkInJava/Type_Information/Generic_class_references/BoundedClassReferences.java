package ThinkInJava.Type_Information.Generic_class_references;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 为了创建一个Class引用，它被限定为某种类型，
 * 或该类型的任何子类型，你需要将通配符与extends关键字相结合
 * ，创建一个范围。因此， 与仅仅声明Class;c::Number>不同，．现在做如下声明：
 *
 *向Class引用添加泛型语法的原因仅仅是为了提供编译期类型检查，
 * 因此如果你操作有误？稍后立即就会发现这一点·. 在使用普通Cla,ss引用，
 * 你不会误入歧途
 * ，但是如果你确实犯了错误， 那么直到运行时你才会发现它，而这显得很不方便。
 * @Date: Create in 18:02 2019/5/18
 */
public class BoundedClassReferences {

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
    }


}
