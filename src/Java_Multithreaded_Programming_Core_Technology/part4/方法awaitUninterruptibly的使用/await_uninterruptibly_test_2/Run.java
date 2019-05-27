package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUninterruptibly的使用.await_uninterruptibly_test_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:50
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
