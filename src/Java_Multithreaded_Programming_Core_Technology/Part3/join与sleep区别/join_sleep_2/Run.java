package Java_Multithreaded_Programming_Core_Technology.Part3.join与sleep区别.join_sleep_2;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 15:55
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 验证join会释放锁
             */
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
