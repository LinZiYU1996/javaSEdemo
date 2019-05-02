package ThinkInJava.Polymorphism.Inheritance_and_cleanup;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:46 2019/5/2
 */
public class Description {

    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose() {
        System.out.println("disposing Description " + s);
    }
}
