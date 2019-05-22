package Java_Multithreaded_Programming_Core_Technology.Part3.多个生产者一消费者.stack_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:15 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);


        C c1 = new C(myStack);


        ThreadP pThread1 = new ThreadP(p1);
        ThreadP pThread2 = new ThreadP(p2);
        ThreadP pThread3 = new ThreadP(p3);
        ThreadP pThread4 = new ThreadP(p4);
        ThreadP pThread5 = new ThreadP(p5);
        ThreadP pThread6 = new ThreadP(p6);
        ThreadC cThread1 = new ThreadC(c1);


        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();
        cThread1.start();
    }
}
