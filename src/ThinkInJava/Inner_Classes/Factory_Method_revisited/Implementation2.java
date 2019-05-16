package ThinkInJava.Inner_Classes.Factory_Method_revisited;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2019/5/16
 */
public class Implementation2 implements Service{

    private Implementation2() {}

    public void method1() {System.out.println("Implementation2 method1");}
    public void method2() {System.out.println("Implementation2 method2");}
    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation2();
                }
            };


}
