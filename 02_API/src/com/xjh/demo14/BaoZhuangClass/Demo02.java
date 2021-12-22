package com.xjh.demo14.BaoZhuangClass;

import java.util.ArrayList;

//自动装箱和拆箱：JDK1.5之后的新特性
public class Demo02 {
    public static void main(String[] args) {
        Integer in = 1;//自动装箱，相当于Integer in = new Integer(1);

        in = in + 2;//自动拆箱：相当于in = in.intValue + 2 = 3

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱（list.add(new Integer(1)))
        int a = list.get(0);//自动拆箱list.get(0).intValue
    }
}
