package com.xjh.BianliangDifference;

public class Demo04UseStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("某某某");
        stu.setAge(0);
        stu.setMale(true);

        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("是不是男性："+ stu.isMale());
    }
}
