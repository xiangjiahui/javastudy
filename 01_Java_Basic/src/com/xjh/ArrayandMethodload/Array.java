/*
不确定具体的数量用动态数组，确定了具体的数量用静态数量
 */
package com.xjh.ArrayandMethodload;

public class Array {
    public static void main(String[] args) {
        int [] arrayA = new int[100];       //动态数组标准格式
        double [] arrayB = new double[20];
        String [] arrayC = new String[10];

        int [] arrayD;
        arrayD = new int[100];      //动态数组也可拆分成两个步骤

        int [] arrayS = new int[] {1,2,3};      //静态数组标准格式
        String [] arrayG = new String[] {"Hello ","World!!","JAVA"};
        System.out.println(arrayG[0]+arrayG[1]+arrayG[2]);

        int [] arr;
        arr = new int[] {10,20,30};     //静态数组可拆分成两个步骤

        int [] array = {10,100,100};    //静态数组的省略格式，动态数组无

//        int [] array0;                //错误，静态初始化的省略格式不能拆分为两个步骤
//        array0 = {10,30};

        int len = array.length;
        System.out.println("数组array长度为："+len);
    }
}
