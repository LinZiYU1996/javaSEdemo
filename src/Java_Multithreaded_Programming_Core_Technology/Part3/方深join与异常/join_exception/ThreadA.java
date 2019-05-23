package Java_Multithreaded_Programming_Core_Technology.Part3.方深join与异常.join_exception;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:37 2019/5/23
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }

}
