package Java_Multithreaded_Programming_Core_Technology.Part2.原子类也并不完全安全.atomic_interger_no_safe;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:29 2019/5/22
 */
public class Run {

    public static void main(String[] args) {
        try {
            /**
             * 虽然用了atomicX类，但是如果不加synchronized还是会出现问题。但是结果是正确的
             *
             * 方法和方法之间的调用却不是原子的。解决这样的问题必须要用同步
             *
             *
             */
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
