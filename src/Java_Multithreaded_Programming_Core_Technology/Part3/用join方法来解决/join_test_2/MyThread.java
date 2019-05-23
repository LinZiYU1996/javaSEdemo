package Java_Multithreaded_Programming_Core_Technology.Part3.用join方法来解决.join_test_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2019/5/23
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
