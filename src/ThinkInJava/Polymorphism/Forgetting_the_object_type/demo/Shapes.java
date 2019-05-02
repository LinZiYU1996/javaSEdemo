package ThinkInJava.Polymorphism.Forgetting_the_object_type.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:19 2019/5/2
 */
public class Shapes {


    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();



        //ff/:~
        //Shape基类为自它那里继承而来的所有导出类建立了一个公用接口—一也就是说，所有形

        //状都可以描绘和控除。导出类通过覆盖这些定义，来为每种特殊类型的几何形状提供单独的行为。

        //RandomShapeGenerator是一种“工厂"(factory) ,
        // 在我们每次调用nextO方法时，它可以为随机选择的Shape对象产生一个引用
        // 。请注意向上转型是在return语句里发生的。每个return 语句取得一个指向某个CircleSquare或者Triangle的引用，并将其以Shape类型从nextO方法中
        //发送出去。所以无论我们在什么时候调用next()方法时，是绝对不可能知道具体类型到底是什么
        //的，因为我们总是只能获得一个通用的Shape引用。

        //main()包含了一个Shape引用组成的数组，通过调用RandomShapeGenerator.next()来填入
        //数据。此时，我们只知道自己拥有一些Shape,除此之外不会知道更具体的情况（编译器也不知
        //道）。然而，当我们遍历这个数组，并为每个数组元素调用drawO方法时，与类型有关的特定行匝习 为会神奇般地正确发生，我们可以从运行该程序时所产生的输出结果中发现这一点。


        //随机选择几何形状是为了让大家理解：在编译时，编译器不需要获得任何特殊信息就能进
        //行正确的调用。对drawO方法的所有调用都是通过动态绑定进行的。






    }



}
