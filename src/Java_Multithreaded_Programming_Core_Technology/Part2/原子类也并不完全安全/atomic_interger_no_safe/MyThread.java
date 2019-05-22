package Java_Multithreaded_Programming_Core_Technology.Part2.原子类也并不完全安全.atomic_interger_no_safe;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:29 2019/5/22
 */
public class MyThread extends Thread{


    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.addNum();
    }


}
