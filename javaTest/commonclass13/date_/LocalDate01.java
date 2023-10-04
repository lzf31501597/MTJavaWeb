package com.javaTest.commonclass13.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate01 {
    public static void main(String[] args) {
        //1.
        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate.now()=" + ld);
        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime.now()=" +lt);



        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //2.
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 hh小时 mm分钟 ss秒 E");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 hh:mm:ss秒 E");
        String format = dtf.format(localDateTime);
        System.out.println(format);

        //3.
        LocalDate now = LocalDate.now(); //可以获取年月日
        LocalTime now2 = LocalTime.now();//获取到时分秒

        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        //看看 890 天后，是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime1 = localDateTime.plusDays(890);
        System.out.println("890 天后=" + dtf.format(localDateTime1));

        //看看在 3456 分钟前是什么时候，把 年月日-时分秒输出
        LocalDateTime localDateTime2 = localDateTime.minusMinutes(3456);
        System.out.println("3456 分钟前 日期=" + dtf.format(localDateTime2));


    }
}
