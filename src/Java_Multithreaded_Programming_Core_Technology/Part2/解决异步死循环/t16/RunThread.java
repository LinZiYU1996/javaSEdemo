package Java_Multithreaded_Programming_Core_Technology.Part2.解决异步死循环.t16;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:54 2019/5/21
 */
public class RunThread extends Thread{

    volatile private boolean isRunning = true;
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("in run method ");
        while (isRunning == true) {

        }
        System.out.println("end run method");
    }


}
