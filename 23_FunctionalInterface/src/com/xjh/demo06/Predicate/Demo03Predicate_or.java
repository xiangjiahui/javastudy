package com.xjh.demo06.Predicate;

import java.util.function.Predicate;

public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(s);//or方法，相当于逻辑或
    }

    public static void main(String[] args) {
        String s = "bcdefg";

        boolean b = checkString(s,(str)->{
            return str.length()>5;
        },(str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
