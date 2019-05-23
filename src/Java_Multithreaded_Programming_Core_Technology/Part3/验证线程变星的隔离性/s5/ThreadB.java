package Java_Multithreaded_Programming_Core_Technology.Part3.验证线程变星的隔离性.s5;


import java.util.Date;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 20:50
* @Version:        1.0

*/
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("B " + Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
