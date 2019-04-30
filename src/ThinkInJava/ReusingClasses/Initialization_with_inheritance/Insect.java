package ThinkInJava.ReusingClasses.Initialization_with_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:47 2019/4/30
 */
public class Insect {

    private int i = 9;


    protected int j;


    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printlnInit("static Insect.x1 initialized");


    static int printlnInit(String s) {

        System.out.println(s);
        return 47;
    }

}
