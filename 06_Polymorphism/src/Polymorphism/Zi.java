package Polymorphism;

public class Zi extends Fu{

    int num = 20;

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }

}
