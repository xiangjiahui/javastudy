package com.xjh.demo05.String;
/*
String当中与转换相关的方法：
public char[] toCharArray():将当前字符串拆分成字符数组作为返回值
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串
【备注】：CharSequence意思就是可以接受字符串
 */
public class Demo06StringConvert {

    public static void main(String[] args) {
        //转换成字符数组
        String str = "Hello";
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);   //H
        System.out.println(chars.length);   //5

        System.out.println("————————————————————————————————————————");

        //转换成字节数组
        String strA = "ABC";
        byte[] bytes = strA.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();

        //字符替换
        String strB = "会不会玩，你个傻逼，你个傻逼！！！";
        System.out.println(strB.replace("傻逼","**"));
    }
}
