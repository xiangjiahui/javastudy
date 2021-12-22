package com.xjh.DefineclassandUse;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        //使用面向过程方法，每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+",");
            }
        }
        System.out.println("====================");
        //使用面向对象方法，只用找到帮他做事的人
        System.out.println(Arrays.toString(array));
    }
}
