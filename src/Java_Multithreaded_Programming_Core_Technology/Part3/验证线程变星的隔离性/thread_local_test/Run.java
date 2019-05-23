package Java_Multithreaded_Programming_Core_Technology.Part3.验证线程变星的隔离性.thread_local_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 16:03
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 每个线程只取出自己的数据
             */
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main " + (i + 1));
                System.out.println("Main get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
