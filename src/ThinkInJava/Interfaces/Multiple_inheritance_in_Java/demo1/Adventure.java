package ThinkInJava.Interfaces.Multiple_inheritance_in_Java.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:53 2019/5/2
 */
public class Adventure {

    public static void t(CanFight x) { x.fight(); }

    public static void u(CanSwim x) { x.swim(); }


    public static void v(CanFly x) { x.fly(); }

    public static void w(ActionCharacter x) { x.fight(); }


    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }

    //注意，CanFight接口与ActionCharacter类中的fightO方法的特征签名是一样的，而且，在

    //一
    //Hero中并没有提供fightO的定义。可以扩展接口，但是得到的只是另个接口
    // 。当想要创建对象时，所有的定义首先必须都存在。即使Hero没有显式地提供fight()的定义
    // ，其定义也因 ActionCharacter而随之而来，这样就使得创建Hero对象成为了可能。

    //在Adventure类中，可以看到有四个方法把上述各种接口和具体类作为参数。当Hero对象被创建时，它可以被传递给这些方法中的任何一个，
    // 这意味若它依次被向上转型为每一个接口。 由千Java中这种设计接口的方式，使得这项工作并不需要程序员付出任何特别的努力。
    //一定要记住，前面的例子所展示的就是使用接口的核心原因：为了能够向上转型为多个基类型（以及由此而带来的灵活性）。然而，
    // 使用接口的第二个原因却是与使用抽象基类相同：防止客户端程序员创建该类的对象，井确保这仅仅是建立一个接口。这就带来了一个问题
    // ：我们应该使用接口还是抽象类？如果要创建不带任何方法定义和成员变盆的基类，那么就应该选择接口而不是抽象类。事实上，如果知道某串物应该成为一个基类，
    // 那么第一选择应该是使它成





}
