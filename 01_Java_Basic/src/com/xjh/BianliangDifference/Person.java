package com.xjh.BianliangDifference;

public class Person {
    String name;
    private int age;    //一旦使用private。超出本类就无法直接使用，但可以间接使用，设置set和get方法

    public void show(){
        System.out.println("名字："+name+" 年龄："+age);
    }

    public void setAge(int num) {   //set必须有参数无返回值
        if(num<100 && num>=0){
            age = num;
        }else {
            System.out.println("年龄数据不合理！！！");
        }
    }

    public int getAge() {   //get必须无参数，有返回值
        return age;
    }
}
