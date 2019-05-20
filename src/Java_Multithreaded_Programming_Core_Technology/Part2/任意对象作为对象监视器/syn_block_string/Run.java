package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_block_string;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:21 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 此处如果synchronized(非this对象x) x不同则不同步，只对x相同的进行同步。
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
