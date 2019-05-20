package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法的弊端.t5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:48 2019/5/20
 */
public class ThreadB extends Thread{

    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime2 = System.currentTimeMillis();
    }


}
