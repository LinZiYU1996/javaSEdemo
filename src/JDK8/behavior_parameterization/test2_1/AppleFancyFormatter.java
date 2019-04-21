package JDK8.behavior_parameterization.test2_1;


import JDK8.behavior_parameterization.Apple;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 15:28 2019/4/21
 **/
public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String character = apple.getWeight() > 150 ? "heavy" : "light";
        return "Apple : " + character + "  " + apple.getColor() + "  apple";
    }
}
