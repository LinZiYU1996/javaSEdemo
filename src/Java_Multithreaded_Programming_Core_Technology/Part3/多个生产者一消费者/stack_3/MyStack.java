package Java_Multithreaded_Programming_Core_Technology.Part3.多个生产者一消费者.stack_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:15 2019/5/22
 */
public class MyStack {

    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notifyAll();
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("pop thread " + Thread.currentThread().getName() + " process is waiting");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
