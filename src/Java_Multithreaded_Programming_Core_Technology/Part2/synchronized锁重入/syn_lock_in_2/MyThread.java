package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_2;



/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:32 2019/5/20
 */
public class MyThread extends Thread{


    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }


}
