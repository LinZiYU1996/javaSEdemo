package Java_Multithreaded_Programming_Core_Technology.Part2.半异步半同步.t7;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 不在sync缸onized块中就是异步执行， 在synchronized块中就是同步 执行。
 *
 *
 * @Date: Create in 15:56 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        /**
         * 在没有synchronized包裹的代码中会有随机性，但是进入synchronized代码块就会排队执行
         */
        Task task = new Task();
        ThreadA aThread = new ThreadA(task);
        ThreadB bThread = new ThreadB(task);
        aThread.start();
        bThread.start();
    }


}
