package com.xjh.demo14.BaoZhuangClass;
//基本类型与字符串类型之间的相互转换
public class Demo03 {
    public static void main(String[] args) {
        //基本类型-->字符串(String)
        int i = 100;
        String s = i + "";//1.基本类型的值+""（工作常用）
        System.out.println(s+200);

        String s1 = Integer.toString(100);//2.包装类的静态方法toString（参数），返回一个表示整数的String对象
        System.out.println(s1+200);

        String s2 = String.valueOf(100);//3.String类的静态方法valueOf(int i)返回int参数的字符串表示形式
        System.out.println(s2+200);

        //字符串-->基本类型
        int i1 = Integer.parseInt(s);//Integer类：static int parseInt(String s)
        System.out.println(i1-10);
    }
}
