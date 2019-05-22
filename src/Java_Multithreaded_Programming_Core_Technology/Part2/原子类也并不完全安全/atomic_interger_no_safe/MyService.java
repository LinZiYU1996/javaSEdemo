package Java_Multithreaded_Programming_Core_Technology.Part2.原子类也并不完全安全.atomic_interger_no_safe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:28 2019/5/22
 */
public class MyService {

    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + "After add 100, the aiRef = " + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }


}
