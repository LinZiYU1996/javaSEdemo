package Java_Multithreaded_Programming_Core_Technology.Part3.等待wait的条件发生变化.wait_old;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在使用wait/notify模式时，还需要注意另外一种情况，也就是wait等待的条件发生了变化，也容易造成程序逻辑的混乱。
 *
 *
 * @Date: Create in 15:24 2019/5/22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Add add = new Add(lock);
        Substract substract = new Substract(lock);
        ThreadSubstract subThread1 = new ThreadSubstract(substract);
        ThreadSubstract subThread2 = new ThreadSubstract(substract);
        ThreadAdd addThread = new ThreadAdd(add);
        subThread1.setName("subThread 1");
        subThread2.setName("subThread 2");
        addThread.setName("addThread 2");
        subThread1.start();
        subThread2.start();
        Thread.sleep(10000);
        addThread.start();

    }
}
