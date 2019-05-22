package Java_Multithreaded_Programming_Core_Technology.Part3.学习方法join前的铺垫.join_test_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:50 2019/5/22
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
