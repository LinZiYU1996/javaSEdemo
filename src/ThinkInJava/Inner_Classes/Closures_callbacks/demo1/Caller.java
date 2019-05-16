package ThinkInJava.Inner_Classes.Closures_callbacks.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:53 2019/5/16
 */
public class Caller {

    private Incrementable callbackReference;
    Caller(Incrementable cbh) { callbackReference = cbh; }
    void go() { callbackReference.increment(); }


}
