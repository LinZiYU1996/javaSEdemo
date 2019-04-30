package ThinkInJava.ReusingClasses.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:31 2019/4/30
 */
public class Soap {

    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}
