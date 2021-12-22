package com.xjh.DefineclassandUse;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone one = getPhone();         //赋值调用
        System.out.println(one.color);
    }

    public static Phone getPhone(){     //自定义的类作为方法的返回值
        Phone p = new Phone();
        p.color = "玫瑰金";

        return p;
    }
}

