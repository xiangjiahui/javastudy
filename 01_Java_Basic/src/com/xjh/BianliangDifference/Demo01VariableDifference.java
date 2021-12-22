package com.xjh.BianliangDifference;
/*
局部变量（main中的变量）和成员变量（自定义的class中）
1.定义的位置不一样【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类中

2.作用范围不一样【重点】
局部变量：只有方法当中可以使用，出了方法就不能使用
成员变量：整个类都可以用

3.默认值不一样【重点】
局部变量：没有默认值，如果要想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样
 */
public class Demo01VariableDifference {
    String name;        //成员变量
    public void method(){
        int num = 20;       //局部变量
        System.out.println(num);
    }
    public void methodB(int param){     //方法的参数就是局部变量
//        System.out.println(num);    //错误写法
        System.out.println(name);
    }
}
