package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作值假死.p_c_all_wait;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:38 2019/5/22
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                Thread.sleep(100);
                while (!ValueObject.value.equals("")) {
                    System.out.println("provider " + Thread.currentThread().getName() + " waiting ");
                    lock.wait();
                }
                System.out.println("provider " + Thread.currentThread().getName() + " runnable ");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value = " + value);
                System.out.println("======================================================================");
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
