package Java_Multithreaded_Programming_Core_Technology.part6.用静态内置类实现单例模式.singleton_7;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:20
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //使用静态内置类来实现单例模式。
        t1.start();
        t2.start();
        t3.start();
    }
}
