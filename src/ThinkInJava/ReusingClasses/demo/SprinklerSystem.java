package ThinkInJava.ReusingClasses.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:21 2019/4/30
 */
public class SprinklerSystem {

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }


    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);



        //在上面两个类所定义的方法中，有一个很特殊：toString()。
        // 每一个非基本类型的对象都有一个toString()方法，
        // 而且当编译器需要一个String而你却只有一个对象时，该方法便会被调用。 所以在SprinklerSystem.toString()的表达式中：
        //"source=•+ source:
        //编译器将会得知你想要将一个String对象("source=")同WaterSource相加。
        // 由于只能将一个 String对象和另一个String对象相加，因此编译器会告诉你：“我将调用toStringO,把source转换


        //臣成为一个String!"这样做之后，它就能够将两个String连接到一起并将结果传递给System.out




    }
}
