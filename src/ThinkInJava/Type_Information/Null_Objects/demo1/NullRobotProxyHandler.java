package ThinkInJava.Type_Information.Null_Objects.demo1;

import ThinkInJava.Type_Information.Null_Objects.demo.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:12 2019/5/19
 */
public class NullRobotProxyHandler implements InvocationHandler {


    private String nullName;
    private Robot proxied = new NRobot();
    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }
    private class NRobot implements Null, Robot {
        public String name() { return nullName; }
        public String model() { return nullName; }
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        return method.invoke(proxied, args);
    }


}
