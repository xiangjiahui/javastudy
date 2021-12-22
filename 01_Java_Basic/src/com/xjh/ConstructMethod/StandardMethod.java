package com.xjh.ConstructMethod;
/*
一个标准的类通常拥有以下四个组成部分：
1.每一个成员变量都用private关键字修饰
2.为每一个成员变量编写一对getter/setter方法
3.编写一个无参的构造方法
4.编写一个全参的构造方法
 */
public class StandardMethod {
    private String name;
    private int age;

    public StandardMethod() {
    }

    public StandardMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
