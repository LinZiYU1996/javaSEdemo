package Java_Multithreaded_Programming_Core_Technology.Part3.用join方法来解决.join_test_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2019/5/23
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {
        MyThread threadTest = new MyThread();
        threadTest.start();
        threadTest.join();
        //join是对当前线程无限阻塞，等调用join的线程结束了再执行当前线程。
        System.out.println("The End!");
    }




}
