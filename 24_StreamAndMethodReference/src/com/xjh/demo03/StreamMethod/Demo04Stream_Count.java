package com.xjh.demo03.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
Stream流中的方法count:用于统计Stream流中元素的个数
long count():count方法是一个终结方法，返回值是一个long类型的整数
 */
public class Demo04Stream_Count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);

        Stream<Integer> stream = list.stream();
        long c = stream.count();
        System.out.println(c);
    }
}
