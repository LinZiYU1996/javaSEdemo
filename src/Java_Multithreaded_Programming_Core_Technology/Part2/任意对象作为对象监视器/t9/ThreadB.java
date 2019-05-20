package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.t9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:32 2019/5/20
 */
public class ThreadB extends Thread{

    private MyOneList list;

    public ThreadB(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }


}
