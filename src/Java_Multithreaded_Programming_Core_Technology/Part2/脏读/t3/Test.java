package Java_Multithreaded_Programming_Core_Technology.Part2.脏读.t3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:23 2019/5/20
 */
public class Test {

    public static void main(String[] args) {
        try {
            /**
             * 如果方法B不加synchronized关键字，那么调用B方法就可能会读到脏数据;
             * 如果加了，那么在调用B方法之前已经进入A方法执行没有结束，那么B方法的调用就会出现等待。A方法结束过后才会执行B方法
             * 也就是说，如果一个对象里面有多个synchronized方法时，调用时相当于加了获得了所在对象的锁。
             */
            PublicVar publicVarRef = new PublicVar();
            ThreadA aThread = new ThreadA(publicVarRef);
            aThread.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
