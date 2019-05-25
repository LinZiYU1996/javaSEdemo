package Java_Multithreaded_Programming_Core_Technology.Part3.值继承.inheritable_thread_local;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:29
* @Version:        1.0

*/
public class Run {

    //使用I咄eritableThreadLocal类可以让子线程从父线 程中取得值。

    public static void main(String[] args) {
        //子线程用InheritableThreadLocal就可以共享父线程的数据。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main process value = " + Tools.t1.get());
                Thread.sleep(102);

            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
