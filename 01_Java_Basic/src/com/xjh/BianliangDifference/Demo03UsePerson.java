package com.xjh.BianliangDifference;

public class Demo03UsePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "向嘉晖";
//        person.age = 22;
        person.setAge(20);
        person.show();
    }
}
