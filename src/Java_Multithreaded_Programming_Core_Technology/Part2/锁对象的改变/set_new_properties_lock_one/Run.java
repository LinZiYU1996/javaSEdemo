package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_properties_lock_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:32 2019/5/21
 */
public class Run {

    public static void main(String[] args) {
        try {
            /**
             * 只要对象不变，即使对象的属性被改变，运行的结果还是同步。
             */
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA aThread = new ThreadA(service, userInfo);
            ThreadB bThread = new ThreadB(service, userInfo);
            aThread.setName("A");
            bThread.setName("B");
            aThread.start();
            Thread.sleep(50);
            bThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
