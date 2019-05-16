package ThinkInJava.Inner_Classes.Closures_callbacks.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:53 2019/5/16
 */
public class Callee2 extends MyIncrement{

    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        public void increment() {
            // Specify outer-class method, otherwise
            // you’d get an infinite recursion:
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }


}
