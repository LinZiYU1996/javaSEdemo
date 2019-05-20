package Java_Multithreaded_Programming_Core_Technology.Part2.同步synchronized方法无限等待与解决.two_stop;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:24 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * B线程永远得不到机会运行
         *
         * 更改service 把synchronized方法改成改成使用Object对象的synchronized代码块。
         *
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.start();
        bThread.start();
    }


}
