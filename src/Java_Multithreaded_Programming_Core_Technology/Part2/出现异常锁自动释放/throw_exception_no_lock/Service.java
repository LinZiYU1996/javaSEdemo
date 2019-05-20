package Java_Multithreaded_Programming_Core_Technology.Part2.出现异常锁自动释放.throw_exception_no_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:41 2019/5/20
 */
public class Service {

    synchronized public void testMethod() {
        if ("a".equals(Thread.currentThread().getName())) {
            System.out.println("Thread name = " + Thread.currentThread().getName() + " Run begin time = " + System.currentTimeMillis());
            while (true) {
                if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
                    System.out.println("Thread name = " + Thread.currentThread().getName() + " Run exception = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B Run time = " + System.currentTimeMillis());
        }
    }


}
