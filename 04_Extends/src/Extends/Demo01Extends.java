package Extends;
/*
继承主要解决的问题就是：共性抽取
在继承的关系中，“子类就是一个父类”，也就是，子类可以被当作父类看待。（例如父类是员工子类是讲师，那么讲师就是一个员工）
定义父类的格式：public class 父类名称(){    //  }
定义子类的格式：public class 子类名称 extends 父类名称{     //  }

在父子类的继承关系当中，如果成员变量重名。则创建子类对象时，访问有两种方式。
直接通过子类对象访问成员变量：
        等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量
        方法属于谁，就优先用谁，没有则向上找
区分子类方法中重名的三种方法:
    局部变量：直接写成员变量名
    本类的成员变量：this.成员变量名
    父类的成员变量：super.成员变量名
 */
public class Demo01Extends {

    public static void main(String[] args) {
        Teacher t = new Teacher();
//        t.methodZi();
        System.out.println("==============");
        t.method(); //执行父类的方法method
        System.out.println(t.numFu);    //父类，20
        System.out.println(t.num);  //200,优先子类，200
        System.out.println(t.numZi);    //子类，10

        System.out.println("=================");
        t.methodZia();//200,这个方法是子类的，优先使用子类的，没有在向上找
        t.methodFu();//100,这个方法是父类的，属于父类，所以优先使用父类的方法
    }
}
