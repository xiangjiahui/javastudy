package com.xjh.ConstructMethod;
/*
当方法的局部变量和类的成员变量重名时，根据“就近原则”，优先使用局部变量。
如果需要访问本类当中的成员变量，需要使用格式：this.成员变量名

"通过谁调用的方法，谁就是this"
 */
public class Person {   //关键字this的作用
    String name;

//    public void sayHello(String who){
//        System.out.println(who+",你好！"+"我是，"+name+"。");
//    }
    public void sayHello(String name){
        System.out.println(name+",你好！"+"我是，"+this.name+"。");    //this-->Person
    }
}
