package Java_Multithreaded_Programming_Core_Technology.Part3.生产消费操作栈.stack_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:48 2019/5/22
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
