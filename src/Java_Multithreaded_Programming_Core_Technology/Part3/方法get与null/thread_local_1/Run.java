package Java_Multithreaded_Programming_Core_Technology.Part3.方法get与null.thread_local_1;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 16:10
* @Version:        1.0

*/
public class Run {
    public static ThreadLocal<String> t1 = new ThreadLocal<>();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("t1 is null");
            t1.set("t1 value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());

    }
}
