package Java_Multithreaded_Programming_Core_Technology.Part2.验证同步synchronizedthis代码块是锁定当前对象的.t8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:11 2019/5/20
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 异步打印会出现在输出随机位置，
         * 同步打印只会出现在doLongTimeTask打印结束
         * 是对象级别的锁
         */
        Task task = new Task();
        ThreadA aThread = new ThreadA(task);
        ThreadB bThread = new ThreadB(task);
        aThread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bThread.start();

    }
}
