package ThinkInJava.Inner_Classes.Closures_callbacks.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:52 2019/5/16
 */
public class Callee1 implements Incrementable{

    private int i = 0;
    public void increment() {
        i++;
        System.out.println(i);
    }


}
