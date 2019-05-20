package Java_Multithreaded_Programming_Core_Technology.Part2.静态同步synchronized方法与synchronized代码块.syn_more_object_static_one_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:08 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 同步锁 多个对象 静态方法  没必要测试这个
         */
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA aThread = new ThreadA(service1);
        ThreadB bThread = new ThreadB(service2);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();

    }


}
