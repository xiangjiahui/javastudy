package com.xjh.DefineclassandUse;
/*一个类并不能直接使用，需要根据一个类创建一个对象，才能使用
步骤：
1.导包：指出需要使用的类所在的位置。
import 包名称.类名称
import com.xjh.day01.demo03.Student
【注】：对于和当前类同属于一个包的情况，可以省略导包语句不写
2.创建。格式：
类名称 对象名 = new 类名称（）;
Student stu = new Student();
3.使用。分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
*/
public class UseStudent {
    public static void main(String[] args) {
        Student stu = new Student();    //创建对象

        //使用成员变量
        System.out.println(stu.name);       //也可在主函数中改变变量的值
        System.out.println(stu.age);        //stu.name = "xxx";

        stu.eat();
        stu.sleep();
        stu.study();
    }

}
