package Java_Multithreaded_Programming_Core_Technology.Part2.使用原子类.atomic_integer_test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:02 2019/5/21
 */
public class AddCountThread extends Thread{

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }


}
