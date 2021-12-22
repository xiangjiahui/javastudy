package com.xjh.demo03.StreamMethod;

import java.util.stream.Stream;

/*
如果需要将流中的元素映射到另一个流中，可以使用map方法
<R> Stream map(Function<? super T, ? extends R> mapper)
该接口需要一个Function函数式接口，可以将当前流中的T类型数据转换为另一种R类型的流
 */
public class Demo03Stream_Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> is = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        is.forEach(i-> System.out.println(i));
    }
}
