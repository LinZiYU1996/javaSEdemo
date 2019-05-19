package Java_Multithreaded_Programming_Core_Technology.Part2.实例变量非线程安.t2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:55 2019/5/19
 */
public class HasSelfPrivateNum {

    private int num = 0;

    /**
     * 如果不加synchronized 则会出现 实例变量非线程安全，多个线程共同访问num而导致的数据错误
     * @param username
     */
    public synchronized void addI(String username) {
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1500);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
