package Java_Multithreaded_Programming_Core_Technology.part4.使用Condition实现等待通知错误用法与解决.use_condition_wait_notify_error;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:48
* @Version:        1.0

*/
public class Run {

    //关键字synchronized与waitO和notifyQ/notifyAll()方法相结合可以实现等待／通知模式，
    // 类ReentrantLock也可以实现同样的功能，但需要借助千Condition对象。Condition类是 在JDK5中出现的技术，
    // 使用它有更好的灵活性，比如可以实现多路通知功能，也就是在一 个Lock对象里面可以创建多个Condition(即对象监视器）实例
    // ，线程对象可以注册在指定 的Cond巾on中，从而可以有选择性地进行线程通知，在调度线程上更加灵活。
    //在使用notify()/notifyAll()方法进行通知时，被通知的线程却是由JVM随机选择的。但 使用ReentrantLock结合Condition类是
    // 可以实现前面介绍过的”选择性通知”，这个功能是 非常重要的，而且在Condition类中是默认提供的。
    //而synchronized就相当于整个Lock对象中只有一个单一的Con山tion对象，所有的线程 都注册在它一个对象的身上。线程开始notifyAll()时，
    // 需要通知所有的WAITING线程，没 有选择权，会出现相当大的效率问题。



    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
