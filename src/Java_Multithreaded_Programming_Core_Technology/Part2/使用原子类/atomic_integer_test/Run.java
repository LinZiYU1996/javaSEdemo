package Java_Multithreaded_Programming_Core_Technology.Part2.使用原子类.atomic_integer_test;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 原子操作是不能分割的整体， 没有其他线程能够中断或检查正在原子操作中的变量。
 * 一 个原子(atomic)类型就是一个原子操作可用的类型， 它可以在没有锁的清况下做到线程安全 (thread-safe)。
 *
 *
 *
 *
 * @Date: Create in 11:03 2019/5/21
 */
public class Run {

    public static void main(String[] args) {
        /**
         * i++除了synchronized关键字实现同步以外，使用原子类AtomicInteger原子类也可以进行实现。
         */
        AddCountThread countService = new AddCountThread();
        Thread[] thread = new Thread[5];
        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread(countService);
        }
        for (int i = 0; i < 5; i++) {
            thread[i].start();
        }
    }


}
