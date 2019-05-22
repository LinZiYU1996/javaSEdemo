package Java_Multithreaded_Programming_Core_Technology.Part2.解决同步死循环.t10;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:52 2019/5/21
 */
public class PrintString implements Runnable{

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod thread name = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        printStringMethod();
    }


}
