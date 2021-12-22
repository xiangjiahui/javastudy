package com.xjh.demo02.Stream;

import java.util.*;
import java.util.stream.Stream;

/*
java.util.stream.Stream<T>是Java 8新加入的最常用的流接口
获取流的常用方式:
        所有的Collection集合(单列集合)都可以通过Stream默认方法获取流
            default Stream<T> stream()
        Stream接口的静态方法of可以获数组对应的流
            static<T> Stream<T> of (T...values)
            参数是一个可变参数，那么就可以传递一个数组
 */
public class Demo01GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对(键与值的映射关系)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] str = {"a","bb","ccc"};
        Stream<String> stream8 = Stream.of(str);
    }
}
