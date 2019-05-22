package Java_Multithreaded_Programming_Core_Technology.Part3.一生产与多消费操作栈解决wait条件改变与假死.stack_2_old;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 问题的出现就是因为在MyStack.java类中使用了if语句作为条件判断
 *
 * 因为条件发生改变时并没有得到及时的响应，所以多个呈wait状态的线程被唤醒，继而执行list.remove(O)代码而出现异常。解决这个办法是，将if改成while语句即可。
 *
 *
 *
 * @Date: Create in 15:54 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread1 = new ThreadC(c1);
        ThreadC cThread2 = new ThreadC(c2);
        ThreadC cThread3 = new ThreadC(c3);
        ThreadC cThread4 = new ThreadC(c4);
        ThreadC cThread5 = new ThreadC(c5);
        pThread.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }



}
