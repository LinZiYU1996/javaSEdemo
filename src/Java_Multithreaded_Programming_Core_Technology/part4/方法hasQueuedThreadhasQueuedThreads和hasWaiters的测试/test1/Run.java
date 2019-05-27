package Java_Multithreaded_Programming_Core_Technology.part4.方法hasQueuedThreadhasQueuedThreads和hasWaiters的测试.test1;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:35
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        /**
         * hasQueuedThread(thread)查询知道这个的线程是否正在等待获取此lock
         * hasQueuedThreads()则是查询是否有线程正在等待获取此lock
         */
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());

    }
}
