package com.xjh.demo07.Function;

import java.util.function.Function;

public class Demo03Test {
    public static int change(String s, Function<String,String> f1,Function<String,Integer> f2,Function<Integer,Integer> f3){
        Integer in = f1.andThen(f2).andThen(f3).apply(s);
        return in;
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";

        int num = change(str, (String s) -> {
            String age = s.split(",")[1];
            return age;
        }, (String s) -> {
            int i = Integer.parseInt(s);
            return i;
        }, (Integer in) -> {
            return in + 100;
        });

        System.out.println(num);
    }
}
