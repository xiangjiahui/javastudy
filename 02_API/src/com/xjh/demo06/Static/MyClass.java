package com.xjh.demo06.Static;

public class MyClass {
    int num;
    static int numStatic;
    public void method(){
        System.out.println("执行了普通的成员方法");
        System.out.println(num);//成员方法可以访问成员变量
        System.out.println(numStatic);//成员方法可以访问静态变量
    }

    public static void staticMethod(){
        System.out.println("执行了静态方法");
        System.out.println(numStatic);//静态方法可以访问静态变量
//        System.out.println(num);//错误。静态不能直接访问非静态
    }
}
