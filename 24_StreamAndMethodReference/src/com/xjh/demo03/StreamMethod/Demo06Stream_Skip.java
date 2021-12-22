package com.xjh.demo03.StreamMethod;

import java.util.stream.Stream;

/*
Stream流中的常用方法skip:用于跳过元素
如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流
Stream<T> skip(long n):如果流的当前长度大于n，则跳过前n个;否则将会得到一个长度为0的空流
 */
public class Demo06Stream_Skip {
    public static void main(String[] args) {
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","灰太狼","蕉太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));
    }
}
