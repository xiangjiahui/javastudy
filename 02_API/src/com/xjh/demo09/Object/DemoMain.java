package com.xjh.demo09.Object;

public class DemoMain {

    public static void main(String[] args) {
        Person p1 = new Person("AAA",12);
        Person p2 = new Person("AAA",12);
        boolean b = p1.equals(p2);
        System.out.println(b);
        System.out.println(p1.toString());
    }
}
