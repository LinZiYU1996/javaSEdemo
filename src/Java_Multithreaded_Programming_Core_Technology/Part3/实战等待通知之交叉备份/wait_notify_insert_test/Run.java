package Java_Multithreaded_Programming_Core_Technology.Part3.实战等待通知之交叉备份.wait_notify_insert_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:37 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackUpB backUpB = new BackUpB(dbTools);
            backUpB.start();
            BackUpA backUpA = new BackUpA(dbTools);
            backUpA.start();
        }
    }



}
