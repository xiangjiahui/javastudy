package com.xjh.demo08.Math;

/*
java.util.Math是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static double abs(double num):取绝对值。
public static double ceil(double num):向上取整。
public static double floor(double num):向下取整。
public static double long round(double num):四舍五入。
 */
public class Demo01Math {

    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-2.5));
        System.out.println("===============");
        //向上取整
        System.out.println(Math.ceil(30.9));//31.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("===============");
        //向下取整，抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        System.out.println("================");
        //四舍五入
        System.out.println(Math.round(30.4));//30.0
        System.out.println(Math.round(30.7));//31.0
    }
}
