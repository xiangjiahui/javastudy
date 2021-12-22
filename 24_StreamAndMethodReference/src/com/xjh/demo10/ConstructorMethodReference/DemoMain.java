package com.xjh.demo10.ConstructorMethodReference;

public class DemoMain {
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.personBuilder(name);
        System.out.println(person);
    }

    public static void main(String[] args) {
        printName("张三丰",(String name)->{
            return new Person(name);
        });

        /*
        构造方法new Person(String name)已知
        创建对象已知 new
        就可以使用Person引用new创建对象
         */
        printName("张无忌",Person::new);
    }
}
