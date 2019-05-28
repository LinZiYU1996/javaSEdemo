package Java_Multithreaded_Programming_Core_Technology.part5.方法schedule测试.timer_test_5;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 15:33
* @Version:        1.0

*/
public class Run1 {
    public static void main(String[] args) throws ParseException {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private int count = 0;
            @Override
            public void run() {
                System.out.println("1 Begin 运行了，时间为" + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1   End 运行了，时间为" + new Date());
                count++;
                if (count == 5) {
                    timer.cancel();
                }
            }
        };
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString1 = "2019-01-19 23:33:00";
        Date date1 = sdf.parse(dateString1);
        System.out.println("dateString 1 : " + date1.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        //从date开始 每4秒执行一次 如果计划遭遇当前时间则立即执行
        timer.schedule(task, date1, 3000);
        //如果没有延时的情况，就是以上次执行开始的时间加上 间隔时间period 执行下次任务
    }
}
