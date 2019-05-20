package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized同步代码块的使用.synchronized_one_thread_in;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:50 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("a");
        bThread.setName("b");
        aThread.start();
        bThread.start();
    }


}
