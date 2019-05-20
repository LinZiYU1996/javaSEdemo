package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:31 2019/5/20
 */
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
