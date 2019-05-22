package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized代码块有volatile同步的功能.synchronized_update_new_value;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:33 2019/5/22
 */
public class Service {

    private boolean isContinueRun = true;
    synchronized public void runMethod() {
        String anyString = new String();
        while (true == isContinueRun) {
            synchronized (anyString) {
            }
        }
        System.out.println("stopped!");
    }

    public void stopMethod() {
        isContinueRun = false;
    }


}
