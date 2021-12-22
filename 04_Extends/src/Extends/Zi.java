package Extends;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容
1.在本类的成员方法中，访问本类的成员变量
2.在本类的成员方法中，访问本类的另一个成员方法
3.在本类的构造方法中，访问本类的另一个构造方法
咋在第三种用法当中要注意：   this（...）调用也必须是构造方法的第一个语句，唯一一个.this和super不能同时调用
 */
public class Zi extends Fu{

    int num = 20;
    public Zi(){
        this(10);
//        super();      //调用父类无参构造
//        super(20);      //调用父类重载构造方法
        System.out.println("子类构造方法");
    }
    public Zi(int n){

    }
    public void show(){
        int num = 10;
        System.out.println(num);//局部变量10
        System.out.println(this.num);//成员变量20
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
    @Override
    public String method(){
        return null;
    }
}
