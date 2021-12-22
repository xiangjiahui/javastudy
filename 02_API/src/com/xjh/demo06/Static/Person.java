package com.xjh.demo06.Static;

public class Person {

    static {
        System.out.println("执行了静态代码块");
    }

    public Person() {
        System.out.println("执行了构造方法");
    }
}
