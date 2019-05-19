package ThinkInJava.Type_Information.Reflection_runtime_class_information.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:40 2019/5/19
 */
public class Implementation implements SomeMethods{

    public void boring1() { System.out.println("boring1"); }
    public void boring2() { System.out.println("boring2"); }
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }
    public void boring3() { System.out.println("boring3"); }


}
