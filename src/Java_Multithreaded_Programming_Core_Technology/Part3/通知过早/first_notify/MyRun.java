package Java_Multithreaded_Programming_Core_Technology.Part3.通知过早.first_notify;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:20 2019/5/22
 */
public class MyRun {

    private String lock = new String("");

    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("  end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin");
                lock.notify();
                System.out.println("notify   end");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        Thread b = new Thread(run.runnableB);
        //如果AB启动顺序正常则A会被正常唤醒：a先启动
        //a.start();
        //b.start();

        //如果AB启动顺序不正常，则A不会被唤醒,会一直停在wait()，后面的代码不执行。
        b.start();
        Thread.sleep(100);
        a.start();
    }


}
