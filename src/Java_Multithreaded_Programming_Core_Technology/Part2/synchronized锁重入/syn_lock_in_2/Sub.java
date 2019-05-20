package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_2;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * @Date: Create in 11:32 2019/5/20
 */
public class Sub extends Main{

    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("Sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
