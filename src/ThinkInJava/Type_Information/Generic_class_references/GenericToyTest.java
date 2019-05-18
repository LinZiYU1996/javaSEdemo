package ThinkInJava.Type_Information.Generic_class_references;

import ThinkInJava.Type_Information.The_Class_object.demo1.FancyToy;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 当你将泛型语法用千Class对象是，会发生一件很有趣的事情：
 * newlnstanceO将返回该对象的确切类型，而不仅仅只是在ToyTest.java中看到的基本的Object。
 * 这在某种程度上有些受限：
 *
 * 如果你手头的是超类，
 * 那编译器将只允许你声明超类引用是“某个类，它是FancyToy超类"'
 * 就像在表达式Class<?Super FancyToy>中所看到的，
 * 而不会接受Class<Toy>这样的声明。这看 上去显得有些怪，
 * 因为getSuperClassO方法返回的是基类（不是接口），
 * 井且编译器在编译期就知道它是什么类型了一—在本例中就是Toy.cl邸S一而不仅仅只是“某个类，
 * 它是FancyToy超类”。不管怎样，正是由于这种含糊性，up.newInstance()的返回值不是精确类型，
 * 而只是Object。
 *
 *
 *
 *
 * @Date: Create in 18:49 2019/5/18
 */
public class GenericToyTest {

    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type:
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // This won’t compile:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Object:
        Object obj = up.newInstance();
    }


}
