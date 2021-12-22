package com.xjh.ArrayandMethodload;
//数组作为方法参数值传递
public class PrintArray {
    public static void main(String[] args) {
        int [] array = {12,23,45,446,56,};

        System.out.println(array);

        printArray(array);          //传递进去的就是array当中保存的地址值
    }

    public static void printArray(int [] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
    }
}
