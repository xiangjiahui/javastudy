package com.xjh.demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo04Predicate_Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男"};

        ArrayList<String> list = filter(arr, (String str) -> {
            return str.split(",")[0].length() == 4;
        }, (String str) -> {
            return str.split(",")[1].equals("女");
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
