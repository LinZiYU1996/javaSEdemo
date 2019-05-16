package ThinkInJava.Holding_Your_Objects.Generics_and_type_safe_containers.demo1;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * Apple和Orange类是有区别的，它们除了都是 Object之外没有任何共性（记住， 如果一个类
 * 没有显式地声明继承自哪个类，那么它自动地继承自Object)。因为 ArrayList保存的是 Object,
 * 因此你不仅可以通过ArrayList的add0方法 将Apple对象放进这个容器，还可以添加Orange对象，
 * 而且无论在编译期还是运行时都不会有问题。当你在使用ArrayLfst的getO方法来取出你认为 是
 * Apple的对象时，你得到的只是 Object引用， 必须将其转型为Appl􀁶, 因此，
 * 需要将整个表达式 [ill] 括起来， 在调用Apple的idO方法之前，强制执行转型。否则，
 * 你就会得到语法错误。在运行时，
 * 当你试图将Orange对象转型为Apple时，你就会以前面提及的异常的形式得到一个错误。
 *
 *
 *
 * @Date: Create in 20:30 2019/5/16
 */
public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        for(int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
        // Orange is detected only at run time
    }



}
