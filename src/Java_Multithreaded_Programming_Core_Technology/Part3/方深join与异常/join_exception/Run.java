package Java_Multithreaded_Programming_Core_Technology.Part3.方深join与异常.join_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在join过程中，如果当前线程对象被中断，则当前线程出现异常。
 *
 * 说明方法join()与interrupt()方法如
 * 果彼此遇到， 则会出现异常。 但进程按钮
 *还呈 红色 ，原因是线程Thread.A还在 继续运行， 线程Thread.A并未出现异常， 是正常执行的状态。
 *
 *
 *
 * @Date: Create in 15:36 2019/5/23
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadB bThread = new ThreadB();
            bThread.start();
            Thread.sleep(500);
            ThreadC cThread = new ThreadC(bThread);
            cThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
