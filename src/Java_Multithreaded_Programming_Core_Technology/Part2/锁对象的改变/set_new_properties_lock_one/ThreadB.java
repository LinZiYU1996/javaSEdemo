package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_properties_lock_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:33 2019/5/21
 */
public class ThreadB extends Thread{

    private Service service;
    private UserInfo userInfo;

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }

    public ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }


}
