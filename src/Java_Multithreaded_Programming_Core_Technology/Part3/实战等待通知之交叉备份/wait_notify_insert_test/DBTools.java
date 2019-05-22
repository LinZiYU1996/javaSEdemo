package Java_Multithreaded_Programming_Core_Technology.Part3.实战等待通知之交叉备份.wait_notify_insert_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:36 2019/5/22
 */
public class DBTools {

    volatile private boolean prevIsA = false;
    synchronized public void backUpA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★️");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backUpB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}
