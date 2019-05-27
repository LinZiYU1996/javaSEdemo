package Java_Multithreaded_Programming_Core_Technology.part4.方法isFairisHeldByCurrentThread和islocked的测试.test1;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:28
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {

        //法 boolean isF 的作用是判断是丕是公屯锁
        final Service service1 = new Service(true);
        final Service service2 = new Service(false);
        Runnable runnable1 = service1::serviceMethod;
        Runnable runnable2 = service2::serviceMethod;
        //ReentrantLock默认是非公平锁
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}
