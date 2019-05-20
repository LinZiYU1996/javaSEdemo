package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_block_string2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:25 2019/5/20
 */
public class Service {

    private String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }


}
