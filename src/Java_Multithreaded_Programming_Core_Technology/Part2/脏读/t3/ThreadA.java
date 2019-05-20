package Java_Multithreaded_Programming_Core_Technology.Part2.脏读.t3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:23 2019/5/20
 */
public class ThreadA extends Thread{

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }


}
