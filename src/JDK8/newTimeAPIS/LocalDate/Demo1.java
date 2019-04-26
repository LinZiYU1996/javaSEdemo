package JDK8.newTimeAPIS.LocalDate;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/*
*
 * @Author Mr.Lin
 * @Description //
 *LocalDate类。该类的实例是一个不
可变对象，它只提供了简单的日期，并不含当天的时间信息。另外，它也不附带任何与时区相关
的信息。
*
*
 * @Date 15:30 2019/4/26
 **/
public class Demo1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014,5,7);

        int year = date.getYear();

        Month month = date.getMonth();

        int day = date.getDayOfMonth();

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        int len = date.lengthOfMonth();

        boolean leap = date.isLeapYear();

        //使用工厂方法从系统时钟中获取当前的日期：

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);


        //TemporalField是一个接口，它定
        //义了如何访问temporal对象某个字段的值。ChronoField枚举实现了这一接口，所以你可以很
        //方便地使用get方法得到枚举元素的值

        int years  = date.get(ChronoField.YEAR);

        int months = date.get(ChronoField.MONTH_OF_YEAR);

        int days = date.get(ChronoField.DAY_OF_MONTH);

        System.out.println(years + "----" + months + "-------" + days);

        //创建LocalTime并读取其值

        LocalTime time = LocalTime.of(13, 45, 20);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();


        //LocalDate和LocalTime都可以通过解析代表它们的字符串创建。使用静态方法parse

        LocalDate dates = LocalDate.parse("2014-03-18");

        LocalTime times = LocalTime.parse("13:45:20");



    }
}
