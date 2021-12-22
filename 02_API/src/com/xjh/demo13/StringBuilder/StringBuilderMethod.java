package com.xjh.demo13.StringBuilder;
/*
append 方法始终将这些字符添加到生成器的末端；而 insert 方法则在指定的点添加字符。
 */
public class StringBuilderMethod {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        StringBuilder sb2 = sb.append("abc");//把sb.地址赋值给sb2
        System.out.println(sb2==sb);//true，地址值相同

        StringBuilder sb3 = new StringBuilder();
//        sb3.append("aaa");
//        sb3.append(111);
//        sb3.append('中');

        //链式编程：方法返回值是一个对象，可以继续调用方法
        sb3.append("aaa").append(111).append("中");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("start");
        sb4.insert(3,123);
        System.out.println(sb4);
    }
}
