package Java_Multithreaded_Programming_Core_Technology.Part3.值继承再修改.inheritable_thread_local_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:43
* @Version:        1.0

*/
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA process value = " + Tools.t1.get());
                Thread.sleep(101);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
