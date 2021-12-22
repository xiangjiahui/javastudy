package com.xjh.demo08.SuperMethodReference;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man");
    }

    public void method(Greeatable g){
        g.greet();
    }

    public  void show(){
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
