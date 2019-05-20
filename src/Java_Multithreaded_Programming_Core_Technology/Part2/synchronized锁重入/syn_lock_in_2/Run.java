package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized锁重入.syn_lock_in_2;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 可重入锁也支持在父子类继承的环境中。
 *
 *此实验说明，当存在父子类继承关系时，子类是完全可以通过
 *”可重入锁调用父类的同步方法的。
 *
 *
 *
 *
 * @Date: Create in 11:32 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 可重入锁 ：父子传递，可以子类调用父类
         */
        MyThread myThread = new MyThread();
        myThread.start();
    }


}
