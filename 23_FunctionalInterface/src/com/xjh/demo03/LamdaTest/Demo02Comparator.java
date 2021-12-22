package com.xjh.demo03.LamdaTest;

import java.util.Arrays;
import java.util.Comparator;

//函数时接口作为方法的返回值类型案例
public class Demo02Comparator {
    public static void main(String[] args) {
        String[] arr = {"aaaaaa","d","cccccc","dddddddddddddddddddd"};
        System.out.println("排序前:"+ Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println("排序后:"+Arrays.toString(arr));
    }

    public static Comparator<String> getComparator(){
        return (String o1,String o2)->{
            return o2.length() - o1.length();
        };
    }
}
