package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_string_two_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:26 2019/5/21
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        /**
         * A执行的时候改变了lock的值，所以B的锁是"456"，所以AB异步执行了。
         */
        MyService service = new MyService();
        ThreadA aThread = new ThreadA(service);//123
        ThreadB bThread = new ThreadB(service);//456
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        Thread.sleep(50);
        bThread.start();
    }


}
