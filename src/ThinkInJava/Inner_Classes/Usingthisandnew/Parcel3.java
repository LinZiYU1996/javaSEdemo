package ThinkInJava.Inner_Classes.Usingthisandnew;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 要想直接创建内部类的对象， 你不能按照你想象的方式，去引用外部类的名字DotNew,
 * 而是必须使用外部类的对象来创建该内部类对象， 就像在上面的程序中所看到的那样。
 * 这也解决 了内部类名字作用域的问题， 因此你不必声明（实际上你不能声明） do.new DotNew.InnerO.
 * 在拥有外部类对象之前是不可能创建内部类对象的。 这是因为内部类对象会暗暗地连接到创建它的外部类对象上
 * 。 但是， 如果你创建的是嵌套类（静态内部类），那么它就不需要对外部 类对象的引用。
 *
 * @Date: Create in 11:13 2019/5/16
 */
public class Parcel3 {

    class Contents {
        private int i = 11;
        public int value() { return i; }
    }


    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }


    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // Must use instance of outer class
        // to create an instance of the inner class:
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }

}
