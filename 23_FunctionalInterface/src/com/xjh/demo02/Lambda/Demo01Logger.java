package com.xjh.demo02.Lambda;

/*
日志案例:使用Lambda表达式解决性能浪费问题
发现一下代码存在性能浪费问题:如果日志等级不是1，那么就不会显示拼接好了的字符串，存在了浪费
 */
public class Demo01Logger {
    public static void main(String[] args) {
        //定义三个日志信息
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";

        showLog(1,s1+s2+s3);
    }

    //定义一个根据日志级别，显示日志信息的方法
    public static void showLog(int level,String message){
        if(level == 1){
            System.out.println(message);
        }
    }
}
