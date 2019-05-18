package ThinkInJava.Type_Information.Generic_class_references;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 泛化的Class引用
 * Class引用总是指向某个Class对象，它可以制造类的实例，
 * 并包含可作用干这些实例的所有方法代码。它还包含该类的静态成员，
 * 因此，Class引用表示的就是它所指向的对象的确切类型，
 * 而该对象便是Class类的一个对象。
 * 但是，JavaSE5的设计者们看淮机会，将它的类型变得更具体了一些，
 * 而这是通过允许你对 Class引用所指向的Oass对象的类型进行限定而实现的，
 * 这里用到了泛型语法。在下面的实例中， 两种语法都是正确的：
 *
 *
 * @Date: Create in 18:00 2019/5/18
 */
public class GenericClassReferences {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }


}
