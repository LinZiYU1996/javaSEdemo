package Thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * *三个线程分别打印A，B，C，要求这三个线程一起运行，打印n次，输出形如“ABCABCABC....”的字符串。
 * @Date 19:27 2019/4/15
 **/
public class TestThread3 {

    public static void main(String[] args) {
        PrintABCUsingLockCondition printABC = new PrintABCUsingLockCondition(10);
        new Thread(printABC::printA).start();
        new Thread(printABC::printB).start();
        new Thread(printABC::printC).start();
    }


}


//使用Lock/Condition
class PrintABCUsingLockCondition {
    private int times;
    private int state;
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();

    public PrintABCUsingLockCondition(int times) {
        this.times = times;
    }



    public void printA() {
        print("A", 0, conditionA, conditionB);
    }

    public void printB() {
        print("B", 1, conditionB, conditionC);
    }

    public void printC() {
        print("C", 2, conditionC, conditionA);
    }

    private void print(String name, int targetState, Condition current,
                       Condition next) {
        for (int i = 0; i < times;) {
            lock.lock();
            try {
                while (state % 3 != targetState) {
                    current.await();
                }
                state++;
                i++;
                System.out.print(name);
                next.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
