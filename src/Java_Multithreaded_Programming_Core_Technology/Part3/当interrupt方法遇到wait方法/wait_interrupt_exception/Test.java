package Java_Multithreaded_Programming_Core_Technology.Part3.当interrupt方法遇到wait方法.wait_interrupt_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:09 2019/5/22
 */
public class Test {

    public static void main(String[] args) {
        try {
            /**
             * 当一个wait的线程调用interrupt方法会出现InterruptedException
             */
            Object lock = new Object();
            ThreadA aThread = new ThreadA(lock);
            aThread.start();
            Thread.sleep(5000);
            aThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
