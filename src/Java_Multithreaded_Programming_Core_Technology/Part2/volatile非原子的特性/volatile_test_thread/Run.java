package Java_Multithreaded_Programming_Core_Technology.Part2.volatile非原子的特性.volatile_test_thread;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 关键字volatile虽然增加了实例变量在多个线程之间的可见性，但它却不具备同步性．那么也就不具备原子性
 *
 *
 *
 * @Date: Create in 10:59 2019/5/21
 */
public class Run {


    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }
    }


}
