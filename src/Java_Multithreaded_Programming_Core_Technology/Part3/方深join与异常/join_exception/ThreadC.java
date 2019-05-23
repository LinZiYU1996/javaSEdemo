package Java_Multithreaded_Programming_Core_Technology.Part3.方深join与异常.join_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:37 2019/5/23
 */
public class ThreadC extends Thread{

    private ThreadB bThread;

    public ThreadC(ThreadB bThread) {
        this.bThread = bThread;
    }

    @Override
    public void run() {
        super.run();
        bThread.interrupt();
    }



}
