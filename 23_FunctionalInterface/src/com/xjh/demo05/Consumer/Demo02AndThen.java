package com.xjh.demo05.Consumer;

import java.util.function.Consumer;

/*
Consumer接口的默认方法AndThen
作用:需要两个Consumer接口，可以把两个Consumer接口组合到一起，在对数据进行消费
例如:
    Consumer<String> con1
    Consumer<String> con2
    String s = "a";
    con1.andThen(con2).accept(s);谁写前面谁先消费
 */
public class Demo02AndThen {
    public static void method(String name, Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method("Hello",
                (t1)->{
                    System.out.println(t1.toUpperCase());
                },
               (t2)->{
                   System.out.println(t2.toLowerCase());
                });
    }
}
