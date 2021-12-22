package com.xjh.ConstructMethod;

public class demo02UseStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("——————————————————————————————");

        Student stu2 = new Student("某某某",20);
        System.out.println("姓名："+stu2.getName()+" 年龄："+stu2.getAge());
    }
}
