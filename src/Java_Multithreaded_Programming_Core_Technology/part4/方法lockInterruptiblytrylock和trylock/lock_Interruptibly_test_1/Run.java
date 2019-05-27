package Java_Multithreaded_Programming_Core_Technology.part4.方法lockInterruptiblytrylock和trylock.lock_Interruptibly_test_1;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:34
* @Version:        1.0

*/
public class Run {

    //l)方法void lockinterruptiblyQ的作用是： 如果当前线程未被中断， 则获取锁定， 如果

    //已经被中断则出现异常。

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnableRef = service::waitMethod;
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();// 打标记
        System.out.println("main end!");
    }
}
