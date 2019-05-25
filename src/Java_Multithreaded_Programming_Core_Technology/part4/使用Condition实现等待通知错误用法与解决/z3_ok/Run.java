package Java_Multithreaded_Programming_Core_Technology.part4.使用Condition实现等待通知错误用法与解决.z3_ok;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:53
* @Version:        1.0

*/
public class Run {


    //在控制台中只打印一个字母A,原因是调用了Con山tion对象的await()方法，使当前执行任务的线程进入了等待WAJTING状态。


    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
