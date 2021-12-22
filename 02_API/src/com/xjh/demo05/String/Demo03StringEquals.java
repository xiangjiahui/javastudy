package com.xjh.demo05.String;
/*
==是进行地址值的比较。如果需要进行字符串内容的比较，可以使用两个方法。
1.public boolean equals（Object obj）；参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true，否则返回false
【注意事项】：
1.任何对象都能用object进行接收
2.equals具有对称性，也就是a.equals(b)和b.equals(a)是一样的效果
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
例："abc".equals(str),不推荐str.equals("abc")。
2.public boolean equalsIgnoreCase(String str),忽略大小写，进行比较。
 */
public class Demo03StringEquals {

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str2 = new String(charArray);

        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str2));//true
        System.out.println("Hello".equals(str));//true
//        System.out.println(str.equals("Hello"));

        String str3 = "hello";
        System.out.println(str3.equals(str));//false
        System.out.println(str3.equalsIgnoreCase(str));//true

        System.out.println("=========");
        System.out.println(str.toString());
    }
}
