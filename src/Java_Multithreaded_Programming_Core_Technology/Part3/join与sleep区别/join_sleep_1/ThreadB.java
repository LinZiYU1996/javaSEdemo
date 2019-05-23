package Java_Multithreaded_Programming_Core_Technology.Part3.join与sleep区别.join_sleep_1;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:56
* @Version:        1.0

*/
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("b run begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run   end timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService() {
        System.out.println("print b service timer = " + System.currentTimeMillis());
    }
}
