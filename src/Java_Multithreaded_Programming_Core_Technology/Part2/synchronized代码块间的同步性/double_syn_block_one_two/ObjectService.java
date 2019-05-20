package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized代码块间的同步性.double_syn_block_one_two;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:03 2019/5/20
 */
public class ObjectService {

    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A   end time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time = " + System.currentTimeMillis());
            System.out.println("B   end time = " + System.currentTimeMillis());
        }
    }


}
