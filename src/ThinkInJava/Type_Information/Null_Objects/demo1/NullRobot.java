package ThinkInJava.Type_Information.Null_Objects.demo1;

import ThinkInJava.Type_Information.Null_Objects.demo.Null;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:13 2019/5/19
 */
public class NullRobot {

    public static Robot
    newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{ Null.class, Robot.class },
                new NullRobotProxyHandler(type));
    }
    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for(Robot bot : bots)
            Robot.Test.test(bot);
    }


}
