package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_out_asyn;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 验证多个线程调用同一个方法是随机的
 * @Date: Create in 20:28 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 从打印结果看，run和out是成对出现的，但是由于线程执行方法的顺序不一定，
         * 当两个线程执行带有分支判断方法时，就会出现逻辑上的错误。可能出现脏读
         */
        MyList list = new MyList();
        ThreadA aThread = new ThreadA(list);
        ThreadB bThread = new ThreadB(list);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
