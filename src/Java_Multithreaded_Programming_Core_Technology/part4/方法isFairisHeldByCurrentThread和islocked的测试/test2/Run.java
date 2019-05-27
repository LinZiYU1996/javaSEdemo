package Java_Multithreaded_Programming_Core_Technology.part4.方法isFairisHeldByCurrentThread和islocked的测试.test2;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:30
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        //isHeldByCurrentThread是查看当前线程是否保持此锁定。
        thread.start();
    }
}
