package Java_Multithreaded_Programming_Core_Technology.part4.实扣灶扫节消费者模式多对多交替打印.condition_test_many_to_many;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 11:19
* @Version:        1.0

*/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] aThread = new ThreadA[10];
        ThreadB[] bThread = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            aThread[i] = new ThreadA(service);
            bThread[i] = new ThreadB(service);
            aThread[i].start();
            bThread[i].start();
        }
    }
}
