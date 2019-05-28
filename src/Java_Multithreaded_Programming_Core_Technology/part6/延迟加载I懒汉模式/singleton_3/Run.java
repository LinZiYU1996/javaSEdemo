package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_3;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:08
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //遇到多线程同样会出现问题。

        //此方法使同步synchronized语句块，只对实例化对象的关键代码进行同步，
        // 从语句的结 构上来讲，运行的效率的确得到了提升。但如果是遇到多线程的情况下还是无法解决得到同 一个实例对象的结果。


        t1.start();
        t2.start();
        t3.start();
    }
}
