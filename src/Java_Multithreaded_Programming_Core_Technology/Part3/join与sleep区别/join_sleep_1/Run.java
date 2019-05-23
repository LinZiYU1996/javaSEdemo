package Java_Multithreaded_Programming_Core_Technology.Part3.join与sleep区别.join_sleep_1;



/*/**
* @Description:由千线程Thread.A使用Thread.sleep
(long)方法一直持有ThreadB对象的锁，时   图3-49 线程ThreadA不释放ThreadB的锁
间达到6秒， 所以线程ThreadC只有在
Thread.A时间到达6秒后释放Thread.B的锁时， 才可以调用Thread.B中的同步方法synchronized public void bServiceO。
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:50
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
