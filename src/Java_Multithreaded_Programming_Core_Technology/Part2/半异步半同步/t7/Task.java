package Java_Multithreaded_Programming_Core_Technology.Part2.半异步半同步.t7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:57 2019/5/20
 */
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
        }
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }


}
