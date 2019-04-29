package ThinkInJava.constructor.methodOverloading;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:18 2019/4/29
 */
public class Overloading {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
    }
}
