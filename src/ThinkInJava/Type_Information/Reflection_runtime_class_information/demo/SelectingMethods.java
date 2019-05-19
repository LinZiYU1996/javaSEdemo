package ThinkInJava.Type_Information.Reflection_runtime_class_information.demo;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:41 2019/5/19
 */
public class SelectingMethods {

    public static void main(String[] args) {
        SomeMethods proxy= (SomeMethods) Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
                new Class[]{ SomeMethods.class },
                new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }



}
