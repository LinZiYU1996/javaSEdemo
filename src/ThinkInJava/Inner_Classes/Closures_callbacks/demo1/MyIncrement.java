package ThinkInJava.Inner_Classes.Closures_callbacks.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:52 2019/5/16
 */
public class MyIncrement {

    public void increment() { System.out.println("Other operation"); }
    static void f(MyIncrement mi) { mi.increment(); }


}
