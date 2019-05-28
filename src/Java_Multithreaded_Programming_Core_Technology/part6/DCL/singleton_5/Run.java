package Java_Multithreaded_Programming_Core_Technology.part6.DCL.singleton_5;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:10
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //DCL双检查机制 可行  DCL是大多数多线程结合单例模式使用的解决方案。
        t1.start();
        t2.start();
        t3.start();
    }
}
