package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_properties_lock_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:32 2019/5/21
 */
public class Service {

    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end ! time = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
