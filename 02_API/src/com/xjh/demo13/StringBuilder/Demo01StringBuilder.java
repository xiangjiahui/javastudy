package com.xjh.demo13.StringBuilder;
/*
StringBuilder和String可以相互转换：
String-->StringBuilder：可以使用StringBuilder的构造方法
                StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
StringBuilder-->String:可以使用StringBuilder中的toString方法
                public String toString:将当前StringBuilder对象转换为String对象
 */
public class Demo01StringBuilder {

    public static void main(String[] args) {
        //String-->StringBuilder
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append(",World!");
        System.out.println("sb:"+sb);

        //StringBuilder-->String
        String str = sb.toString();
        System.out.println("str:"+str);
    }
}
