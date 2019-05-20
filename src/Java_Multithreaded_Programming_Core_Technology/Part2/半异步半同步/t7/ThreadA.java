package Java_Multithreaded_Programming_Core_Technology.Part2.半异步半同步.t7;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:57 2019/5/20
 */
public class ThreadA extends Thread{

    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }


}
