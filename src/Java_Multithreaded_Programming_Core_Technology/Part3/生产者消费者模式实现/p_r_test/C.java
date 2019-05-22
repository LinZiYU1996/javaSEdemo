package Java_Multithreaded_Programming_Core_Technology.Part3.生产者消费者模式实现.p_r_test;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:31 2019/5/22
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.value)) {
                    lock.wait();
                }
                System.out.println("get value = " + ValueObject.value);
                System.out.println("================================================");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
