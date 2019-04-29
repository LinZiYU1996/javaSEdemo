package ThinkInJava.constructor.methodOverloading;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:16 2019/4/29
 */
public class Tree {

    int height;
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");

    }
    void info() {
        System.out.println("Tree is " + height + " feet tall");

    }
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");

    }

}
