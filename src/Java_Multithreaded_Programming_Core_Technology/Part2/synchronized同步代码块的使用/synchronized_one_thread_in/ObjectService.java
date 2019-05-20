package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized同步代码块的使用.synchronized_one_thread_in;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:50 2019/5/20
 */
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end   time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
