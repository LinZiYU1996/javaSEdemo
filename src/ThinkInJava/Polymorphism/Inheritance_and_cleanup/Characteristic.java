package ThinkInJava.Polymorphism.Inheritance_and_cleanup;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:46 2019/5/2
 */
public class Characteristic {

    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }


}
