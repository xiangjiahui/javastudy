package com.xjh.demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
使用Stream流的方式遍历集合，对集合中的数据进行过滤
Stream流是JDK1.8之后出现的:关注的是做什么，而不是怎么做
 */
public class Demo01Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("玄冥二老");

        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name-> name.length() == 3)
                .forEach(name-> System.out.println(name));
    }
}
