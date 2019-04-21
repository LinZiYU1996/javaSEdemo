package JDK8.behavior_parameterization.test2_1;


import JDK8.behavior_parameterization.Apple;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 15:30 2019/4/21
 **/
public class AppleSimpleFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return  "An apple of : " + apple.getWeight() + " g";
    }
}
