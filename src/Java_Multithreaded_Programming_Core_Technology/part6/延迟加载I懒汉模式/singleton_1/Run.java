package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_1;


public class Run {
    public static void main(String[] args) {
        //延迟加载 懒汉式
        //如果在多线程的环境中 可能会出现取出多个实例的情况。

        //此实验虽然取得一个对象的实例，但如果是在多线程的环境中，就会出现取出多个实例 的清况，与单例模式的初衷是相背离的。
        MyThread t1 = new MyThread();
        t1.start();
    }
}
