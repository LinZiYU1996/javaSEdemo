package JDK8.behavior_parameterization;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 此时要想找 所有重量超过150g的红苹果 就可以创建类来实现接口
 * @Date 15:18 2019/4/21
 **/
public class AppleRedAndHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
