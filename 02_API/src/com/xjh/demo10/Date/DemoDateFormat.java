package com.xjh.demo10.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("——————————————————————");
        demo02();
    }

    //format方法：将日期格式化为文本
    public static void demo01(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(date);
        System.out.println(s);
    }

    //parse方法：将文本解析为日期
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2020年11月04日 23时53分24秒");
        System.out.println(date);
    }
}
