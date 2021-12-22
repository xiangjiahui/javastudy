package com.xjh.demo05.String;
/*
字符串的截取方法
public String substring(int index):截取从参数位置一直到字符末尾，返回新字符串
public String substring(int begin,int end):截取从begin开始，到end结束，中间的字符串
【备注】：[begin,end)
 */
public class Demo05SubString {

    public static void main(String[] args) {
        String str = "Hello,World!!!";
        String s = str.substring(6);
        System.out.println(s);  //World!!!

        String str1 = "HelloWorld";
        String strA = str1.substring(4,7);
        System.out.println(strA);   //oWo


    }
}
