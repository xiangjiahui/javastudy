package com.xjh.demo11.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类常用的成员方法：
public int get(int field):返回给定日历字段的值
public void set(int field,int value):将给定的日历字段设置为给定值
public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
 */
public class CalendarMethod {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    //get方法
    public static void demo01(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);//10月是西方月份(0-11),东方月份(1-12)
        System.out.println(month);

//        int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    //set方法
    public static void demo02(){
        Calendar c = Calendar.getInstance();

        c.set(2020,1,1,1,1,1);
//        c.set(Calendar.YEAR,2088);
        int year = c.get(Calendar.YEAR);
        System.out.print(year+"年");

//        c.set(Calendar.MONTH,1);
        int month = c.get(Calendar.MONTH);
        System.out.print(month+"月");

//        c.set(Calendar.DATE,1);
        int day = c.get(Calendar.DATE);
        System.out.print(day+"日");

//        c.set(Calendar.HOUR,8);
        int hour = c.get(Calendar.HOUR);
        System.out.print(hour+"时");

        int minute = c.get(Calendar.MINUTE);
        System.out.print(minute+"分");

        int second = c.get(Calendar.SECOND);
        System.out.print(second+"秒");
    }

    //add方法，amount:增加/减少指定的值。正数增加，负数减少。
    public static void demo03(){
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,2);//年增加2年
        int year = c.get(Calendar.YEAR);
        System.out.print(year+"年");

        c.add(Calendar.MONTH,-2);
        int month = c.get(Calendar.MONTH);
        System.out.print(month+"月");

        System.out.print('\n');
    }

    //getTime方法，把日历对象转换为日期对象
    public static void demo04(){
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }
}
