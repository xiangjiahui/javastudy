package com.xjh.demo03.StreamMethod;

import java.util.stream.Stream;

/*
Stream流中的常用方法concat:用于把流组合到一起
如果有两个流，希望合并为一个流，那么就可以使用Stream接口的静态方法concat
 */
public class Demo07Stream_Concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "灭绝师太", "张无忌");
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","灰太狼","蕉太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.print(name+" "));
    }
}
