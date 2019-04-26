package JDK8.newTimeAPIS.LocalDateTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 复合类名叫LocalDateTime，是LocalDate和LocalTime的合体。它同时表示了日期
和时间，但不带有时区信息，你可以直接创建，也可以通过合并日期和时间对象构造，
*
 * @Date 15:37 2019/4/26
 **/
public class Demo1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014,5,7);
        LocalTime time = LocalTime.of(13, 45, 20);


        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        LocalDate date1 = dt1.toLocalDate();
        LocalTime time1 = dt1.toLocalTime();


    }
}
