package ThinkInJava.Type_Information.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * III:-
 * 基类中包含draw()方法，它通过传递this参数给System.out.println(),间接地使用toString()
 *
 * 打印类标识符（注意，toString()被声明为abstract,以此强制继承者覆写该方法，并可以防止对无格式的Shape的实例化）。
 * 如果某个对象出现在字符串表达式中（涉及"+"和字符串对象的表 达式），toStringO方法就会被自动调用，以生成表示该对象的String。
 * 每个派生类都要覆盖（从 Objec啡承来的）toString()方法，这样draw()在不同情况下就打印出不同的消息（多态）。
 * 在这个例子中，当把Shape对象放人List<Shape>的数组时会向上转型。但在向上转型为 Shape的时候也丢失了Shape对象的具体类型。对干数组而言
 * ，它们只是Shape类的对象。
 *
 *
 *当从数组中取出元素时，这种容器一􀀋实际上它将所有的举物都当作Object持有气􀀍会自动将结果转型回Shape。这是RITI最基本的使用形式，
 * 因为在Java中，所有的类型转换都是在运行时进行正确性检查的。这也是RTII名字的含义：在运行时，识别一个对象的类型。
 * 在这个例子中，RTTI类型转换并不彻底：Object被转型为Shape,而不是转型为Circle、 Square或者Triangle。
 * 这是因为目前我们只知道这个List<Shape>保存的都是Shape。在编译时，将由容器和Java的泛型系统来强制确保这一点；
 * 而在运行时，由类型转换操作来确保这一点。
 *
 *
 * 接下来就是多态机制的事情了，Shape对象实际执行什么样的代码，
 * 是由引用所指向的具体 对象Circle、Square或者Triangle而决定的。通常，
 * 也正是这样要求的，你希望大部分代码尽可能少地了解对象的具体类型，
 * 而是只与对象家族中的一个通用表示打交道（在这个例子中是
 * Shape)。这样代码会更容易写，更容易读，且更便千维护，设计也更容易实现、理解和改变。
 * 所以“多态”是面向对象编程的基本目标。
 * @Date: Create in 11:26 2019/5/18
 */
public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList)
            shape.draw();
    }


}
