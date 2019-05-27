package Java_Multithreaded_Programming_Core_Technology.part4.方法lockInterruptiblytrylock和trylock.try_lock_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:42
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnableRef = service::waitMethod;
        //tryLock没有参数时 仅在调用时锁定未被另一个线程保持的情况下，才或得该锁定。
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
