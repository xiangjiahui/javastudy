package com.xjh.demo05.String;
/*
字符串的特点：
1.字符串的内容永不可变    【重点】
2.字符串可共享使用
3.字符串效果上相当于char[]字符数组，但底层原理是byte[]字符数组
创建字符串的常见3+1种方式
三种构造方法：
public String（）；空白字符串，没有任何内容。
public String（char[] array）:根据字符数组的内容，来创建对应的字符串。
public String（byte[] array）:根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "";
 */
public class Demo01String {

    public static void main(String[] args) {
        //使用空参构造
        String str = new String();
        System.out.println(str);

        //使用字符数组创建
        char[] charArray = {'A','B','C','D'};
        String str1 = new String(charArray);
        System.out.println(str1);

        //使用字节数组创建
        byte[] byteArray = {97,98,99};
        String str2 = new String(byteArray);
        System.out.println(str2);

        //直接创建
        String str3 = "Hello";
        System.out.println(str3);
    }
}
