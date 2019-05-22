package Java_Multithreaded_Programming_Core_Technology.Part3.不使用等待通知机制实现线程间通信.two_thread_trans_data;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:42 2019/5/22
 */
public class ThreadB extends Thread{

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                System.out.println(list.size());
                if (list.size() == 5) {
                    System.out.println("size == 5 , Thread B out");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
