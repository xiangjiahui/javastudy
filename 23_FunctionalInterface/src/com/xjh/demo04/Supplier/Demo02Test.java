package com.xjh.demo04.Supplier;

import java.util.function.Supplier;

//练习:求数组元素的最大值
public class Demo02Test {
    public static void main(String[] args) {
        int[] arr = {100,2,3,4,5,0,-343,34343,343};
        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i > max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("最大值:"+maxValue);
    }

    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
