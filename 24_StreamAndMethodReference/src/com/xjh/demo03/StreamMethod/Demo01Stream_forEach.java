package com.xjh.demo03.StreamMethod;

import java.util.stream.Stream;

/*
Stream流中的常用方法:forEach
void forEach(Consumer<? super T> action):
        该方法接收一个Consumer接口函数，会将每一个流元素交给该函数处理
简单地:forEach方法用来遍历流中的数据
       是一个终结方法，遍历之后就不能在继续调用Stream流中的其它方法
除了forEach，count聚合方法是终结方法，其余的都是延迟方法
 */
public class Demo01Stream_forEach {
    public static void main(String[] args) {
        //获一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法forEach
/*        stream.forEach((String name)->{
            System.out.print(name+" ");
        });*/
        //当Lambda表达式中只有一个参数和一条输出语句时可简化Lambda表达式
        stream.forEach(name-> System.out.print(name+" "));
    }
}
