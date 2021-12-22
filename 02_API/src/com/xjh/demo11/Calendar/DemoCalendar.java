package com.xjh.demo11.Calendar;

import java.util.Calendar;
/*
Calendar日历类是一个抽象类。静态方法getInstance方法返回了Calendar类的子类
getInstance（）使用默认时区和语言环境获得一个日历
 */
public class DemoCalendar {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
