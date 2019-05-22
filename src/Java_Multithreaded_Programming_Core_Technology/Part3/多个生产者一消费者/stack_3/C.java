package Java_Multithreaded_Programming_Core_Technology.Part3.多个生产者一消费者.stack_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:14 2019/5/22
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop = " + myStack.pop());
    }
}
