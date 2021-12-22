package com.xjh.BianliangDifference;
/*
面向对象三大特征：封装，继承，多态。
封装性在java中的体现：
1.方法就是一种封装
2。关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
//        this.male = b;
        male = b;
    }

    public boolean isMale(){    //isMale而不是getMale
        return male;
    }

    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }
}
