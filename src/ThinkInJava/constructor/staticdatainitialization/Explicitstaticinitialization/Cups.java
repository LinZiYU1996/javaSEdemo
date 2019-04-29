package ThinkInJava.constructor.staticdatainitialization.Explicitstaticinitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:22 2019/4/29
 */
public class Cups {

    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }


}
