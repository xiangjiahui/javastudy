package com.xjh.demo04.ArrayList;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",20);
        Person three = new Person("玛玛哈哈",18);

        array[0] = one;
        array[1] = two;
        array[2] = three;


        System.out.println(array[0].getName());
    }
}
