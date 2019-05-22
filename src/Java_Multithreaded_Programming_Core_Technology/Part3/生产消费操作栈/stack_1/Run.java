package Java_Multithreaded_Programming_Core_Technology.Part3.生产消费操作栈.stack_1;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 生产者向堆栈List对象中放入数据， 使消费者从List堆栈中取出数据。List 最大容址是I, 实验环境只有一个生产者与一个消费者。
 *
 *
 * @Date: Create in 15:48 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        pThread.start();
        cThread.start();
    }


}
