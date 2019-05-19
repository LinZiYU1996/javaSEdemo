package Java_Multithreaded_Programming_Core_Technology.Part2.方法内的变量为线程安全.t1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:35 2019/5/19
 */
public class HasSelfPrivateNum {

    /**
     * 此例子中num属于方法内部变量，线程安全
     * @param username
     */
    public void addI(String username) {
        try {
            int num = 0;
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);

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
