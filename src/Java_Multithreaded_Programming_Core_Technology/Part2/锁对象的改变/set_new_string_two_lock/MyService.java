package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_string_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:26 2019/5/21
 */
public class MyService {

    private String lock = "123";

    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
