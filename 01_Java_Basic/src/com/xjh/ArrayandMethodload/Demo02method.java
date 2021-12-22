package com.xjh.ArrayandMethodload;

public class Demo02method {
    public static void main(String[] args) {
        int [] array = {12,34,45,56,43};
        int max = getMax(array);
        System.out.println("最大值是："+max);
    }

    public static int getMax(int [] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
