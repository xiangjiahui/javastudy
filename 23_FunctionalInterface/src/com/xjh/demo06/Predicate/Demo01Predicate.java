package com.xjh.demo06.Predicate;

import java.util.function.Predicate;

/*
java.util.function.Predicate<T>接口
作用：对某种数据类型的数据进行判断，结果返回一个boolean值
Predicate接口中包含一个抽象方法:
            boolean test(T t):用来对指定数据类型数据进行判断的方法
                结果:符合条件返回true，不符合条件返回false
 */
public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";

        boolean b = checkString(s,(str)->{
            return str.length() > 5;
        });

        System.out.println(b);
    }
}
