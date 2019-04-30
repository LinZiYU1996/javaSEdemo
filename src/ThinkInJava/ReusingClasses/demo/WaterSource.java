package ThinkInJava.ReusingClasses.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2019/4/30
 */
public class WaterSource {


    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString() { return s; }

}
