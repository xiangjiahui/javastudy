package Extends;
//定义一个子类：讲师Teacher
public class Teacher extends Employee{

    int numZi = 10;

    int num = 200;

    public void methodZi(){
        int num = 300;
        System.out.println(num);    //300
        System.out.println(this.num);//200
        System.out.println(super.num);//100
    }

    public void methodZia(){
        System.out.println(num);    //200
    }
}
