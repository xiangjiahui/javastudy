package com.xjh.DefineclassandUse;

public class PhoneParam {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "金色";
        phone.price = 8388.0;

        method(phone);  //传递进去的是地址值
    }

    public static  void method(Phone param){    //自定义的类作为方法的参数
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
