package ThinkInJava.Polymorphism.Behavior_of_polymorphic_methods_inside_constructors;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 构造器调用的层次结构带来了一个有趣的两难问题。 如果在一个构造器的内部调用正在构 造的对象的某个动态绑定方法， 那会发生什么情况呢？
 * 在一般的方法内部， 动态绑定的调用是在运行时才决定的， 因为对象无法知道它是属千方法所在的那个类， 还是属于那个类的导出类。
 * 如果要调用构造器内部的一个动态绑定方法， 就要用到那个方法的被覆盖后的定义。 然而， 这个调用的效果可能相当难千预料， 因为被授盖的方法在对象被完全构造之前就会被调用。 这可 能会造成一些难于发现的隐藏错误。
 *
 *
 *
 * @Date: Create in 10:55 2019/5/2
 */
public class PolyConstructors {


    public static void main(String[] args) {
        new RoundGlyph(5);

        //Glypb.drawO方法设计为将要被覆盖，这种覆盖是在RoundGlypb中发生的。
        // 但是Glyph构造器会调用这个方法，结果导致了对RoundGlyph.draw()的调用
        // ，这看起来似乎是我们的目的。 但是如果看到输出结果，我们会发现当Glyph的构造器调用drawO方法时
        // ，radius不是默认初始值1, 而是0。 这可能导致在屏幕上只画了一个点，或者根本什么东西都没有1 我们只能干瞪眼，
        // 并试图找出程序无法运转的原因所在。



    }
}
