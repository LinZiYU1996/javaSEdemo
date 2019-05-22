package Java_Multithreaded_Programming_Core_Technology.Part3.生产消费操作栈.stack_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:48 2019/5/22
 */
public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push = " + list.size());
            System.out.println("================================================");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                System.out.println("pop thread " + Thread.currentThread().getName() + " process is waiting");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
            System.out.println("================================================");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }



}
