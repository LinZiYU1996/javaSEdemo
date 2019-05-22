package Java_Multithreaded_Programming_Core_Technology.Part3.等待wait的条件发生变化.wait_old;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:24 2019/5/22
 */
public class Substract {

    private String lock;

    public Substract(String lock) {
        this.lock = lock;
    }

    public void substract() {
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin Thread name = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wati   end Thread name = " + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
