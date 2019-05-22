package Java_Multithreaded_Programming_Core_Technology.Part3.生产消费操作栈.stack_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:47 2019/5/22
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop = " + myStack.pop());
        System.out.println("================================================");
    }


}
