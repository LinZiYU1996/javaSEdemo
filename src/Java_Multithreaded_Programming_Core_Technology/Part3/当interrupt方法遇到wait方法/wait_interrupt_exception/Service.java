package Java_Multithreaded_Programming_Core_Technology.Part3.当interrupt方法遇到wait方法.wait_interrupt_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:08 2019/5/22
 */
public class Service {


    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() thread name " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() thread name" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception, Because the process of waiting was interrupted!");
        }
    }


}
