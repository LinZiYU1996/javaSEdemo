package Java_Multithreaded_Programming_Core_Technology.Part3.多个生产者一消费者.stack_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:15 2019/5/22
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
