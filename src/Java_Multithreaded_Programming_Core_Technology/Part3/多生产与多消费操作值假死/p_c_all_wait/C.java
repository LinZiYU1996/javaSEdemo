package Java_Multithreaded_Programming_Core_Technology.Part3.多生产与多消费操作值假死.p_c_all_wait;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:37 2019/5/22
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                Thread.sleep(100);
                while ("".equals(ValueObject.value)) {
                    System.out.println("consumer " + Thread.currentThread().getName() + " waiting ");
                    lock.wait();
                }
                System.out.println("consumer " + Thread.currentThread().getName() + " runnable ");
                System.out.println("get value = " + ValueObject.value);
                System.out.println("======================================================================");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
