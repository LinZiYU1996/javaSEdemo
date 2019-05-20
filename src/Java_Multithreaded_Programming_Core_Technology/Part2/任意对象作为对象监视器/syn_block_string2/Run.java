package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_block_string2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:24 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 验证synchronized方法与同步synchronized(非this对象)是异步调用
         * 由于对象监视器不同，所以结果就是异步的。
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
