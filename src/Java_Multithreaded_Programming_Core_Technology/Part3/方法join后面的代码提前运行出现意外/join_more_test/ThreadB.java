package Java_Multithreaded_Programming_Core_Technology.Part3.方法join后面的代码提前运行出现意外.join_more_test;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:57
* @Version:        1.0

*/
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        super.run();
        try {
            System.out.println("begin B thread name = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B thread name = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
