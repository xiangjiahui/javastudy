package com.xjh.demo06.Static;

//如果一个成员变量使用了static关键字，那么这个变量就不在属于对象自己，而是属于所在的类，多个对象共享同一份数据
public class Demo01Static {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        one.room = "101教室"; //只设置了one的room值，而two也有，这就是两个对象共享了static变量room
        System.out.println("姓名：" + one.getName() + ",年龄：" + one.getAge() + ",教室：" + one.room + "学号：" + one.getId());

        Student two = new Student("黄蓉", 16);
        System.out.println("姓名：" + two.getName() + ",年龄：" + two.getAge() + ",教室：" + two.room + "学号：" + two.getId());
    }
}
