package Java_Multithreaded_Programming_Core_Technology.Part2.同步synchronized方法无限等待与解决.two_stop;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:24 2019/5/20
 */
public class Service {

    Object object1 = new Object();
    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();
    synchronized public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }


}
