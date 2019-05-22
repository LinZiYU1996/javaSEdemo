package Java_Multithreaded_Programming_Core_Technology.Part3.等待wait的条件发生变化.wait_old;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:23 2019/5/22
 */
public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }


}
