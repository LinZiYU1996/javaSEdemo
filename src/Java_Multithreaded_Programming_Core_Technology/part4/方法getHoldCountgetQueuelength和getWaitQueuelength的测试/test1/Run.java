package Java_Multithreaded_Programming_Core_Technology.part4.方法getHoldCountgetQueuelength和getWaitQueuelength的测试.test1;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/27 11:20
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        //getiHoldCount的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法次数。
        Service service = new Service();
        service.serviceMethod1();
    }
}
