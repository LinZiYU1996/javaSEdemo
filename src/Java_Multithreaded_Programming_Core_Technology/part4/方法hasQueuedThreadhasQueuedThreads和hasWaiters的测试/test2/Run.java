package Java_Multithreaded_Programming_Core_Technology.part4.方法hasQueuedThreadhasQueuedThreads和hasWaiters的测试.test2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:36
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        Thread.sleep(2001);
        service.notifyMethod();
        Thread.sleep(2001);
        service.notifyMethod();
    }
}
