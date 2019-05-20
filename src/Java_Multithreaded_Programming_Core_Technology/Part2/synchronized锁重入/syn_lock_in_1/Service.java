package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:28 2019/5/20
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service 1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service 2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service 3");
    }


}
