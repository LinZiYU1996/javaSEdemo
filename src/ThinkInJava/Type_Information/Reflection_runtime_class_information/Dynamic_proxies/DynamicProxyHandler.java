package ThinkInJava.Type_Information.Reflection_runtime_class_information.Dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 动态代理重写的SimpleProxyDemo.java:
 *
 *
 *
 * @Date: Create in 10:35 2019/5/19
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println(" " + arg);
        return method.invoke(proxied, args);
    }

}
