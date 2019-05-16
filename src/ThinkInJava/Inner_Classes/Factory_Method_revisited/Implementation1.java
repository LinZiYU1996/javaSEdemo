package ThinkInJava.Inner_Classes.Factory_Method_revisited;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 工厂方法与匿名内部类
 *
 * @Date: Create in 15:48 2019/5/16
 */
public class Implementation1 implements Service{
    private Implementation1() {}
    public void method1() {System.out.println("Implementation1 method1");}
    public void method2() {System.out.println("Implementation1 method2");}
    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation1();                }
            };

}

