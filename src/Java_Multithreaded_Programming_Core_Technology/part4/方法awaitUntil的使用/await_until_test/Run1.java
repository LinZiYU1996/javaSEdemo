package Java_Multithreaded_Programming_Core_Technology.part4.方法awaitUntil的使用.await_until_test;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 15:53
* @Version:        1.0

*/
public class Run1 {
    public static void main(String[] args){
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        //awaitUntil(时间)   等待， 直到到这个时间就停止等待。等待中间可以被signal提前唤醒
        myThreadA.start();
    }
}
