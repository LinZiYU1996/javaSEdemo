package Java_Multithreaded_Programming_Core_Technology.Part3.方法join后面的代码提前运行出现意外.join_more_test;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 16:10
* @Version:        1.0

*/
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("main end = " + System.currentTimeMillis());
    }
}
