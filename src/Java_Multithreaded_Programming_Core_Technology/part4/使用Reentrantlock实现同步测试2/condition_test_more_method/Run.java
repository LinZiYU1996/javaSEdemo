package Java_Multithreaded_Programming_Core_Technology.part4.使用Reentrantlock实现同步测试2.condition_test_more_method;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:45
* @Version:        1.0

*/
public class Run {

    //调用lock.lock()代码的线程就持有了“对象监视器”，
    // 其他线程只有等待锁被释放时再次争抢。效果和使用synchronized关键字一样，
    // 线程之间还是顺序执行的。


    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadAA aa = new ThreadAA(service);
        ThreadB b = new ThreadB(service);
        ThreadBB bb = new ThreadBB(service);
        a.setName("A");
        aa.setName("AA");
        b.setName("B");
        bb.setName("BB");
        a.start();
        aa.start();
        Thread.sleep(100);
        b.start();
        bb.start();
    }
}
