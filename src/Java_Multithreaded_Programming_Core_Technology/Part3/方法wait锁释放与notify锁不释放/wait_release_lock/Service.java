package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.wait_release_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:07 2019/5/22
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("  end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
