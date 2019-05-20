package Java_Multithreaded_Programming_Core_Technology.Part2.synchronized方法的弊端.t5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:47 2019/5/20
 */
public class Task {

    private String getData1;
    private String getData2;

    synchronized public void doLongTimeTask() {
        try {
            System.out.println("begin task!");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值1 thread name = " + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值2 thread name = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
