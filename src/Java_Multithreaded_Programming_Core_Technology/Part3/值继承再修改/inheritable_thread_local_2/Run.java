package Java_Multithreaded_Programming_Core_Technology.Part3.值继承再修改.inheritable_thread_local_2;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:33
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        //子线程用InheritableThreadLocal就可以共享父线程的数据。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main process value = " + Tools.t1.get());
                Thread.sleep(101);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
