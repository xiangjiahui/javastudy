package com.xjh.DefineclassandUse;

public class PhoneUse {
    public static void main(String[] args) {

        Phone p = new Phone();

        System.out.println("手机："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.print("\n");
        p.call("老阴逼向思猛");
        p.sendMessage();

        //Phone two = p;    将p当中保存的对象地址值赋值给two
        Phone two = new Phone();
    }
}
