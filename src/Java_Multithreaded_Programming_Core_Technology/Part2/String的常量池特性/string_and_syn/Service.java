package Java_Multithreaded_Programming_Core_Technology.Part2.String的常量池特性.string_and_syn;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:18 2019/5/20
 */
public class Service {

    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
