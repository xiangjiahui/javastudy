package com.xjh.demo05.String;
/*
分割字符串的方法：
public String[] split(String regex),按照参数的规则，将字符串切分成若干部分。
【注意】：split方法的参数其实是一个“正则表达式”，如果按照英文句点"."进行切分，写法必须是："\\."
 */
public class Demo07StringSplit {

    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] array1 = str.split(",");
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("——————————————————————————————————");

        String str1 = "aaa bbb ccc";
        String[] array2 = str1.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("————————————————————————————");

        String strA = "XXX.YYY.ZZZ";
        String[] array3 = strA.split(".");
        System.out.println(array3.length);  //0
        System.out.println("————————————————————————————");

        String[] array4 = strA.split("\\.");
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}
