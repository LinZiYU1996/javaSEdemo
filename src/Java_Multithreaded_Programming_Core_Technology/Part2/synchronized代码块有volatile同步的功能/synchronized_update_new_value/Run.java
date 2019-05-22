package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized代码块有volatile同步的功能.synchronized_update_new_value;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 关键字synclu·onized可以保证在同一时刻，只有一个线程可以执行某一个方法或某一个代码块。
 * 它包含两个特征：互斥性和可见性。同步synchronized不仅可以解决一个线程看到对象处千不一致的状态，
 * 还可以保证进入同步方法或者同步代码块的每个线程，都看到由同 一个锁保护之前所有的修改效果。
 *
 *
 *
 * @Date: Create in 10:32 2019/5/22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.start();
        System.out.println("had been stopped !");
    }


}
