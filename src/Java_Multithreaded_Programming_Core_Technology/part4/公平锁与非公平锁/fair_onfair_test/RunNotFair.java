package Java_Multithreaded_Programming_Core_Technology.part4.公平锁与非公平锁.fair_onfair_test;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:17
* @Version:        1.0

*/
public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
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
