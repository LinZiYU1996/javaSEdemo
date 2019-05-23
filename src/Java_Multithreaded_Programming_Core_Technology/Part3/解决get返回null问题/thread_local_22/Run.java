package Java_Multithreaded_Programming_Core_Technology.Part3.解决get返回null问题.thread_local_22;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 21:03
* @Version:        1.0

*/
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        //之类重写了initial方法，可以避免默认为null的情况。
        if (t1.get() == null) {
            System.out.println("null");
            t1.set("my value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
