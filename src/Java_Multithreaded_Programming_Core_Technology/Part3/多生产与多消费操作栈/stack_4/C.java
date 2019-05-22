package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作栈.stack_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:18 2019/5/22
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
