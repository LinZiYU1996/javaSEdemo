package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:27 2019/5/20
 */
public class MyList {

    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("thread name = " + Thread.currentThread().getName() + " Run add method");
        list.add(username);
        System.out.println("thread name = " + Thread.currentThread().getName() + " out add method");
    }

    synchronized public int getSize() {
        System.out.println("thread name = " + Thread.currentThread().getName() + " Run getSize method");
        int sizeValue = list.size();
        System.out.println("thread name = " + Thread.currentThread().getName() + " out getSize method");
        return sizeValue;
    }


}
