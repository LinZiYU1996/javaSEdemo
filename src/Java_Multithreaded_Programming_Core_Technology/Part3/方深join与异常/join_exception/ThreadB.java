package Java_Multithreaded_Programming_Core_Technology.Part3.方深join与异常.join_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:36 2019/5/23
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            ThreadA aThread = new ThreadA();
            aThread.start();
            aThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread B catch print");
            e.printStackTrace();
        }
    }


}
