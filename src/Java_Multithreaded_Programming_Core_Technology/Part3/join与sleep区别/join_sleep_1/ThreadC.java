package Java_Multithreaded_Programming_Core_Technology.Part3.join与sleep区别.join_sleep_1;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:56
* @Version:        1.0

*/
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        super.run();
        threadB.bService();
    }
}
