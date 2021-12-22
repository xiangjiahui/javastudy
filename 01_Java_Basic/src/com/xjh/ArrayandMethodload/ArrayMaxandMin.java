package com.xjh.ArrayandMethodload;

public class ArrayMaxandMin {
    public static void main(String[] args) {
        int [] array = {12,243,4554,5454,6545,656,34,56,234,5,436,1,3,-18};
        int max = array[0];     //从第一个开始比较
        int second;
        int third;
        int x;
        for(int i =0;i<array.length;i++){       //i从1开始而不从0开始，是因为不与自己比较大小
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    x=array[i];
                    array[i]=array[j];
                    array[j]=x;
                }
            }
        }
        max=array[0];
        second=array[1];
        third=array[2];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int min = array[0];
        for(int i =1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最小值是："+min);
    }
}
