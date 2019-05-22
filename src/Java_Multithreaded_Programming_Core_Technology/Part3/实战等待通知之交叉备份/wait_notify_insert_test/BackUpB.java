package Java_Multithreaded_Programming_Core_Technology.Part3.实战等待通知之交叉备份.wait_notify_insert_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:36 2019/5/22
 */
public class BackUpB extends Thread{

    private DBTools dbTools;

    public BackUpB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backUpB();
    }


}
