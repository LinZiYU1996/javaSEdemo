package Practical_Java_high_concurrency_programming.CH3.循环栅栏CyclicBarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:42 2019/5/29
 */
public class CyclicBarrierDemo {

    public static class Soldier implements Runnable {
        private String soldier;
        private final CyclicBarrier cyclic;

        Soldier(CyclicBarrier cyclic, String soldier) {
            this.cyclic = cyclic;
            this.soldier = soldier;
        }

        ///等待所有士兵到齐
        public void run() {
            try {
                cyclic.await();
                doWork();

                ////等待所有士兵完成工作
                cyclic.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

        public void doWork() {
            try {
                Thread.sleep(Math.abs(new Random().nextInt() % 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(soldier + "任务完成");
        }
    }

    public static class BarrierRun implements Runnable {
        boolean flag;
        int N;

        BarrierRun(boolean flag, int N) {
            this.flag = flag;
            this.N = N;
        }


        public void run() {
            if (flag) {
                System.out.println("司令：【士兵" + N + "个，任务完成！】");
            } else {
                System.out.println("司令：【士兵" + N + "个，集合完毕！】");
                flag = true;
            }
        }
    }

    public static void main(String[] args) {
        final int N = 10;
        Thread[] allSoldiers = new Thread[N];
        boolean flag = false;
        CyclicBarrier cyclic = new CyclicBarrier(N, new BarrierRun(flag, N));
        System.out.println("集合队伍");
        for (int i = 0; i < N; i++) {
            System.out.println("士兵" + i + "报道");
            allSoldiers[i] = new Thread(new Soldier(cyclic, "士兵" + i));
            allSoldiers[i].start();
        }
    }



}
