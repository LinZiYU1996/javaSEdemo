package Java_Multithreaded_Programming_Core_Technology.part4.公平锁与非公平锁.fair_onfair_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:14
* @Version:        1.0

*/
public class RunFair {

    //公平与非公平锁：锁Lock分为 “公平锁” 和 “非公平锁,,'
    // 公平锁表示线程获取锁的顺 序是按照线程加锁的顺序来分配的，
    // 即先来先得的FIFO先进先出顺序。而非公平锁就是一 种获取锁的抢占机制，
    // 是随机获得锁的，和公平锁不一样的就是先来的不一定先得到锁 ，
    // 这个方式可能造成某些线程一直拿不到锁，结果也就是不公平的了。



    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★process " + Thread.currentThread().getName() + "run");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
