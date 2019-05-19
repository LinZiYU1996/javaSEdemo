package ThinkInJava.Type_Information.Reflection_runtime_class_information.Dynamic_proxies;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:32 2019/5/19
 */
public class SimpleProxy implements Interface{

    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }


}
