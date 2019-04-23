package Thread.error_demo;


import java.util.ArrayList;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * ArrayList在多线程条件下的测试
 * @Date 20:29 2019/4/23
 **/
public class TestArrayList {

    static ArrayList<Integer> a1 = new ArrayList<>(10);

    public static class Add implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000 ; i++) {
                a1.add(i);
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
                Thread t1 = new Thread(new Add());
                Thread t2 = new Thread(new Add());
                t1.start();
                t2.start();
                t1.join();
                t2.join();
                System.out.println(a1.size());
                // 出现数组越界异常  ArrayList在扩容过程中，内部一致性被破坏
                //由于没有锁的保护机制  另外一个线程访问到了不一致的内部状态



    }

}
