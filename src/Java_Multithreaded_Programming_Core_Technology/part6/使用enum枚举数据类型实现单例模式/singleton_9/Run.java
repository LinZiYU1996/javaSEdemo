package Java_Multithreaded_Programming_Core_Technology.part6.使用enum枚举数据类型实现单例模式.singleton_9;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:25
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
