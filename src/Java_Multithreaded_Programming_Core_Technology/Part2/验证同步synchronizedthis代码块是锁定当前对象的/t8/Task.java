package Java_Multithreaded_Programming_Core_Technology.Part2.验证同步synchronizedthis代码块是锁定当前对象的.t8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:12 2019/5/20
 */
public class Task {

    synchronized public void otherMethod() {
        System.out.println("-----------------------------------Run other method !");
    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}
