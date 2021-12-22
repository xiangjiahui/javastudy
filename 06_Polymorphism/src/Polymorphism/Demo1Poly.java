package Polymorphism;
/*
代码当中体现多态性：父类引用指向子类对象。
格式：
父类名称 对象名 = new 子类名称（）；
或者：
接口名称 对象名 = new 实现类名称（）；
访问成员变量的两种方式
1.直接通过对象名称访问成员变量：等号左边是谁，优先用谁，没有则向上找
2.间接通过成员方法访问成员变量：方法属于谁，优先用谁，没有则向上找
成员方法的访问规则：new的是谁，就优先用谁，没有就向上找
或者：编译看左边，运行看右边
 */
public class Demo1Poly {

    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//父类，10
        obj.showNum();//子类没有覆盖就是父类10，子类覆盖就是子类。20
        obj.method();
        obj.methodFu();
    }
}
