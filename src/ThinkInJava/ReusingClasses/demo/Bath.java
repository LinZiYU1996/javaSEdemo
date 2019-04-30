package ThinkInJava.ReusingClasses.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 1.    在定义对象的地方。这意味着它们总是能够在构造器被调用之前被初始化。
 * 2.	在类的构造器中。
 * 3.	就在正要使用这些对象之前，这种方式称为惰性初始化。在生成对象不值得及不必每次
 *  都生成对象的情况下，这种方式可以减少额外的负担。
 *4.使用实例初始化。
 *
 * @Date: Create in 16:32 2019/4/30
 */
public class Bath {

    private String // Initializing at point of definition:
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // Instance initialization:
    { i = 47; }
    public String toString() {
        if(s4 == null) // Delayed initialization:
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }
    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }


}
