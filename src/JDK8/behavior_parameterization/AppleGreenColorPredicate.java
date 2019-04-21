package JDK8.behavior_parameterization;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *   此时就可以通过实现接口来完成不同的功能选择了

 * @Date 15:10 2019/4/21
 **/
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
