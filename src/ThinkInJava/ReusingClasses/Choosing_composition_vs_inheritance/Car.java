package ThinkInJava.ReusingClasses.Choosing_composition_vs_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 组合和继承都允许在新的类中放置子对象，组合是显式地这样做，而继承则是隐式地做。读者或许想知道二者间的区别何在，以及怎样在二者之间做出选择。
 *
 * 组合技术通常用千想在新类中使用现有类的功能而非它的接口这种情形。
 * 即，在新类中嵌人某个对象，让其实现所需要的功能，但新类的用户看到的只是为新类所定义的接口，
 * 而非所嵌人对象的接口。为取得此效果，需要在新类中嵌入一个现有类的private对象。
 *
 * 有时，允许类的用户直接访问新类中的组合成分是极具意义的，也就是说，将成员对象声明为public
 *
 * 如果成员对象自身都隐藏了具体实现，那么这种做法是安全的。当用户能够了解到你正在组装一组部件时，
 * 会使得端口更加易千理解。car对象即为一个很好的例子：
 *
 *
 * @Date: Create in 19:41 2019/4/30
 */
public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // 2-door
    public Car() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }


}
