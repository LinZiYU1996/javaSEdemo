package ThinkInJava.Inner_Classes.Inner_classes_in_methods_and_scopes.demo1;

import ThinkInJava.Inner_Classes.Inner_classes_and_upcasting.demo1.Destination;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * PDestination类是destination()方法的
 * destination()之外不能访问PDestination。注意出现在
 * return语句中的向上转型一返回的是 Destination的引用，它是PDestination的基类
 * 。当然，在destination()中定义了内部类 PDestination,
 * 并不意味若一旦destO方法执行完毕，PDestination就不可用了．
 * @Date: Create in 15:40 2019/5/16
 */
public class Parcel5 {

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

}
