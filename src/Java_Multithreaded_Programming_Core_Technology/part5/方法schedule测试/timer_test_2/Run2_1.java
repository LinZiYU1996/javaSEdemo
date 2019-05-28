package Java_Multithreaded_Programming_Core_Technology.part5.方法schedule测试.timer_test_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 15:22
* @Version:        1.0

*/
public class Run2_1 {
    public static void main(String[] args) throws ParseException {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Begin，time : " + new Date());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("  End，time : " + new Date());
            }
        };
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString = "2019-01-19 22:13:00";
        Date date = sdf.parse(dateString);
        System.out.println("dateString : " + date.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        //由于任务执行时间过长，间隔时间被延迟。
        timer.schedule(task, date,4000);
    }
}
