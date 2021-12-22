package com.xjh.demo07.Function;

import java.util.function.Function;

public class Demo02Function_AndThen {
    public static void change(String s, Function<String,Integer> f1,Function<Integer,String> f2){
        String str = f1.andThen(f2).apply(s);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s = "123";

        change(s,(String str)->{
            int i = Integer.parseInt(str);
            return i + 10;
        },(Integer in)->{
//            String s1 = Integer.toString(in);
            return in + "";
        });
    }
}
