package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.syn_out_asyn;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:28 2019/5/20
 */
public class ThreadB extends Thread{

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            list.add("ThreadB" + (i + 1));
        }

    }
}
