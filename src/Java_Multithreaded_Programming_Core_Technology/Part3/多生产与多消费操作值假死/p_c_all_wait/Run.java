package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作值假死.p_c_all_wait;


/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 假死” 的现象其实就是线程进入WAITING等待
 *状态。 如果全部线程都进入WAITING状态， 则程序就
 *
 * 不再执行任何业务功能了，整个项目呈停止状态。 这在使用生产者与消费者模式时经常遇到。
 *
 *
 *在代码中确实已经通过wait/notify进行通信了，但不保证notify唤醒的是异类，也许是
 *
 * 同类，比如生产者”唤醒生产者，或消费者唤醒消费者”这样的情况。如果按
 * 这样情况运行的比率积少成多，就会导致所有的线程都不能继续运行下去，大家都在等待，
 * “”
 * 都呈WAITING状态，程序最后也就呈假死状态，不能继续运行下去了。
 *
 *
 * @Date: Create in 15:38 2019/5/22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        int pLen = 2;
        int cLen = 2;
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThread = new ThreadP[pLen];
        ThreadCu[] cThread = new ThreadCu[cLen];
        for (int i = 0; i < pLen; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("Provider " + (i + 1));
            pThread[i].start();
        }
        for (int i = 0; i < cLen; i++) {
            cThread[i] = new ThreadCu(c);
            cThread[i].setName("consumer " + (i + 1));
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }


}
