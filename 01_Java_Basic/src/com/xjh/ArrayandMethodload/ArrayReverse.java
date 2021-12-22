package com.xjh.ArrayandMethodload;

public class ArrayReverse {     //数组元素的反转
    public static void main(String[] args) {
        System.out.print("反转前：");
        int [] array = {12,34,45,657667,45};
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.print("\n");

        int min;
        int max = array.length-1;
        for(min = 0;min < max; min++, max--){
            int temp = array[min];           //temp = a;
            array[min] = array[max];         //a = b;
            array[max] = temp;        //b = temp;
        }

        System.out.println("————————————————————————————————");

        System.out.print("反转后：");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
    }
}
