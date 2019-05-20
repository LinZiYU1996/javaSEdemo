package Java_Multithreaded_Programming_Core_Technology.Part2.同步不具有继承性.syn_not_extends;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:42 2019/5/20
 */
public class Test {

    public static void main(String[] args) {
        /**
         * synchronized 不具有继承性，如果子类需要同步则需要再加上synchronized修饰。
         */
        Sub subRef = new Sub();
        ThreadA aThread = new ThreadA(subRef);
        ThreadB bThread = new ThreadB(subRef);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }


}
