package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUntil的使用.await_until_test;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:53
* @Version:        1.0

*/
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadA.start();
        Thread.sleep(2000);
        myThreadB.start();
    }
}
