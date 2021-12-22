package com.xjh.demo03.StreamMethod;

import java.util.stream.Stream;

/*
Stream中流的常用方法:filter用于对Stream流中的数据进行过滤
Stream<T> filter(Predicate<? super T> predicate)
filter方法中的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
Stream流属于管道流，只能被使用一次。第一个流调用完毕方法，数据就会流转到下一个Stream上
    而这时第一个流已经使用完毕就会关闭，所以第一个流就不能再调用方法了
 */
public class demo02Stream_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "灭绝师太", "张无忌");
        Stream<String> stream2 = stream.filter((String name)->{return name.startsWith("张");});
        stream2.forEach(name-> System.out.println(name));
    }
}
