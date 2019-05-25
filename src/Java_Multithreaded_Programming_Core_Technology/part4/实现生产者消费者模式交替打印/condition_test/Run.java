package Java_Multithreaded_Programming_Core_Technology.part4.实现生产者消费者模式交替打印.condition_test;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:18
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        b.start();
    }
}
