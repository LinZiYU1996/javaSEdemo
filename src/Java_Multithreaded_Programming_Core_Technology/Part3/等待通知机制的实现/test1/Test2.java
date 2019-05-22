package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.test1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:52 2019/5/22
 */
public class Test2 {

    public static void main(String[] args) {
        /**
         * 方法wait线面的代码不执行了。
         */
        try {
            String lock = new String();
            System.out.println("before syn");
            synchronized (lock) {
                System.out.println("syn the first line");
                lock.wait();
                System.out.println("after wait");
            }
            System.out.println("after syn");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




}
