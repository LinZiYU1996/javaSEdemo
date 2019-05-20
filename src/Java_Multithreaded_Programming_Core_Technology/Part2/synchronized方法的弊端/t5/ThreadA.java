package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法的弊端.t5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:47 2019/5/20
 */
public class ThreadA extends Thread{

    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime1 = System.currentTimeMillis();
    }


}
