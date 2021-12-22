package com.xjh.demo05.String;
/*
String当中与获取相关的常用方法：
public int length（）：获取当前字符串当中含有的字符个数，拿到字符串长度
public String concat（String str）：将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt（int index）：获取指定索引位置的单个字符（索引从0开始）
public int indexOf（String str）：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1。
 */
public class Demo04StringGet {

    public static void main(String[] args) {
        //获取字符串长度
        int length = "asdsdsbfhbfhjbajdjhfjadhja".length();
        System.out.println(length);

        //拼接字符串
        String str = "Hello,";
        String str1 = "World!!!";
//        System.out.println(str.concat(str1));
        String str3 = str.concat(str1);
        System.out.println(str3);   //Hello,World!!!

        //获取指定索引位置的单个字符
        String strA = "Hello,World";
        char h = strA.charAt(0);
        System.out.println(h);  //H

        //获取参数字符串在本字符串首次出现的位置
        String strB = "Hello";
        int index = strB.indexOf("llo");
        System.out.println(index);  //2
    }
}
