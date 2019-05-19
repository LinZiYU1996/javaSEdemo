package ThinkInJava.Type_Information.Reflection_runtime_class_information.Dynamic_proxies;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:31 2019/5/19
 */
public class RealObject implements Interface{

    public void doSomething() { System.out.println("doSomething"); }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }


}
