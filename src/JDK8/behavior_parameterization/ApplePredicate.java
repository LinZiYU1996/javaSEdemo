package JDK8.behavior_parameterization;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 对选择标准进行建模
 *
 * 策略设计模式
 *
 * 定义一族算法，把它们封装起来，然后在运行时选择一个算法。这个算法族就是  ApplePredicate
 * 不同策略就是  AppleGreenColorPredicate  和  AppleHeavyWeightPredicate
 * @Date 15:08 2019/4/21
 **/
public interface ApplePredicate {

    boolean test(Apple apple);

}
