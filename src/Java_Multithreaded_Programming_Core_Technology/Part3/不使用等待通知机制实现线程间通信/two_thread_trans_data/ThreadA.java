package Java_Multithreaded_Programming_Core_Technology.Part3.不使用等待通知机制实现线程间通信.two_thread_trans_data;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:42 2019/5/22
 */
public class ThreadA extends Thread{

    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println(Thread.currentThread().getName() + " add " + (i + 1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
