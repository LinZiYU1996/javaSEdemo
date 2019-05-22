package Java_Multithreaded_Programming_Core_Technology.Part3.生产者消费者模式实现.p_r_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:32 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        String lock = "";
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadCu cThread = new ThreadCu(c);
        pThread.start();
        cThread.start();
    }


}
