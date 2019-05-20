package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_block_string;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:21 2019/5/20
 */
public class Service {

    private String usernameParam;
    private String passwordparam;
    //private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("thread name = " + Thread.currentThread().getName() + " come in  at " + System.currentTimeMillis());
                usernameParam = username;
                Thread.sleep(3000);
                passwordparam = password;
                System.out.println("thread name = " + Thread.currentThread().getName() + " out  at " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
