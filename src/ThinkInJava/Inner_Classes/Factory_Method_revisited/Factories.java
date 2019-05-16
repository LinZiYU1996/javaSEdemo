package ThinkInJava.Inner_Classes.Factory_Method_revisited;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:55 2019/5/16
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        // Implementations are completely interchangeable:
        serviceConsumer(Implementation2.factory);
    }


}
