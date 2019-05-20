package Java_Multithreaded_Programming_Core_Technology.Part2.同步不具有继承性.syn_not_extends;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:41 2019/5/20
 */
public class Sub extends Main{

    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub next step begin thread name = " +
                    Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub next step sleep end thread name = " +
                    Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
