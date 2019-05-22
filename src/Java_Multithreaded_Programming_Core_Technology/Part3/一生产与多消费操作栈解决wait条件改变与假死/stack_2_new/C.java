package Java_Multithreaded_Programming_Core_Technology.Part3.一生产与多消费操作栈解决wait条件改变与假死.stack_2_new;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:05 2019/5/22
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
