package Java_Multithreaded_Programming_Core_Technology.part6.立即加载饿汉模式.singleton_0;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 15:59
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //hashCode相同也就是说是同一个对象
        t1.start();
        t2.start();
        t3.start();
    }
}
