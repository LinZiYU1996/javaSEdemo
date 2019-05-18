package ThinkInJava.Type_Information.Class_literals.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:01 2019/5/18
 */
public class Initable {

    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }


}
