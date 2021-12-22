package com.xjh.demo10.Date;

import java.util.Date;

/*
类Date表示特定的瞬间，精确到毫秒。1秒 = 1000毫秒
时间原点（0毫秒）：1970年1月1日 00：00：00（英国格林威治）
【注意】：中国属于东八区，时间增加八个小时。（1970/1/1 08:00:00）
把日期转换为毫秒：就是计算当前日期到时间原点一共经历了多少毫秒（1604470308477L）
把毫秒转换为日期：1 天 = 24 × 60 × 60 = 86400 秒 =  86400 x 1000 = 86400000毫秒
 */
public class DemoMain {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        demo01();
        demo02();
        demo03();
    }

    //Date类的空参构造方法，获取系统当前的日期和时间
    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }

    //Date(long date)Date的带参构造方法：传递毫秒值，把毫秒值转换为Date日期
    public static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);;
    }

    //long getTime():返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。相当于（System.currentTimeMillis()）
    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
