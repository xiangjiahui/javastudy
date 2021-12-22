package com.xjh.demo13.StringBuilder;
/*
StringBuilder() 构造一个其中不带字符的字符串生成器，初始容量为 16 个字符
StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
 */
public class DemoMain {
    public static void main(String[] args) {
        //构造一个其中不带字符的字符串生成器，初始容量为 16 个字符
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        // 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2:"+sb2);
    }
}
