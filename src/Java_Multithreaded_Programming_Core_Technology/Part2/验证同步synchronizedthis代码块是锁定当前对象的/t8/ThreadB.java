package Java_Multithreaded_Programming_Core_Technology.Part2.验证同步synchronizedthis代码块是锁定当前对象的.t8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:12 2019/5/20
 */
public class ThreadB extends Thread{

    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }


}
