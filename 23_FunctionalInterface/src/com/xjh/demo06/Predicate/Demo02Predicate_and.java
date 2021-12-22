package com.xjh.demo06.Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(s);//and方法，相当于逻辑与
    }

    public static void main(String[] args) {
        String s = "abcdef";

        boolean b = checkString(s,(str)->{
            return str.length()>5;
        },(str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
