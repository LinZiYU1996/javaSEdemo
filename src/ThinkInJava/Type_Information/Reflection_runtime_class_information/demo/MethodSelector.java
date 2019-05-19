package ThinkInJava.Type_Information.Reflection_runtime_class_information.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:40 2019/5/19
 */
public class MethodSelector implements InvocationHandler {

    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if(method.getName().equals("interesting"))
            System.out.println("Proxy detected the interesting method");
        return method.invoke(proxied, args);
    }


}
