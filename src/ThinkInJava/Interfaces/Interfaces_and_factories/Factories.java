package ThinkInJava.Interfaces.Interfaces_and_factories;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 工厂方法设计模式
 *
 * 这与直接调用构造器不同，我们在工厂对象上调用的是创建方法，而该工厂对象将生成接
 * 口的某个实现的对象。理论上，通过这种方式，我们的代码将完全与接口的实现分离，这
 * 就使臣习 得我们可以透明地将某个实现替换为另一个实现。下面的实例展示了工厂方法的结构：
 *
 *
 *
 *
 * @Date: Create in 9:44 2019/5/6
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        // Implementations are completely interchangeable:
        serviceConsumer(new Implementation2Factory());
    }

}
