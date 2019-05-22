package Java_Multithreaded_Programming_Core_Technology.Part3.方法wait锁释放与notify锁不释放.wait_release_lock;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 当方法wait()被执行后， 锁被自动释放， 但执行完notify()方法， 锁却不自动释放。
 *
 *
 * @Date: Create in 11:08 2019/5/22
 */
public class Test {

    public static void main(String[] args) {
        /**
         * wait方法释放锁，两个都会执行。但是wait后的代码不会被执行。
         */
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        ThreadB bThread = new ThreadB(lock);
        aThread.start();
        bThread.start();
    }


}
