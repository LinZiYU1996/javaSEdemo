package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:03
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //打印出的hashcode不一样，说明这个单例模式是错误的。
        t1.start();
        t2.start();
        t3.start();
    }
}
