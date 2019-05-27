package Java_Multithreaded_Programming_Core_Technology.part4.方法isFairisHeldByCurrentThread和islocked的测试.test3;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:31
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        //isLocked作用是查询此锁定是否由任意线程保持
        thread.start();
    }
}
