package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.t9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:32 2019/5/20
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 此时操作的时候由于同步锁，在进入addServiceMethod方法的时候。
         * 还没有加进去，所以两个在加的时候都为0，所以会出现两个都加进去了
         * 出现了脏读，原因是两个线程以异步的方式返回list参数的size大小。
         *  解决方法：把if(list.getSize()<1){}变为同步代码块。
         */
        MyOneList list = new MyOneList();
        ThreadA aThread = new ThreadA(list);
        ThreadB bThread = new ThreadB(list);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
        Thread.sleep(6000);
        System.out.println("list size = " + list.getSize());
    }


}
