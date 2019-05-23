package Java_Multithreaded_Programming_Core_Technology.Part3.验证线程变星的隔离性.thread_local_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 16:03
* @Version:        1.0

*/
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB " + (i + 1));
                System.out.println("ThreadB get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
