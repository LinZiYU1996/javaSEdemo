package Java_Multithreaded_Programming_Core_Technology.Part3.方法join的使用.join_long;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:56
* @Version:        1.0

*/
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join(2000);
            System.out.println("End timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
