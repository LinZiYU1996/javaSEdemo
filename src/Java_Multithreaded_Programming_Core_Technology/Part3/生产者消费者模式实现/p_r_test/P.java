package Java_Multithreaded_Programming_Core_Technology.Part3.生产者消费者模式实现.p_r_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:32 2019/5/22
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value = " + value);
                System.out.println("================================================");
                ValueObject.value = value;
                Thread.sleep(1000);
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
