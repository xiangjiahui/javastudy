package com.xjh.demo07.Arrays;

import java.util.Arrays;
/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组):将参数数组变成字符串（按照默认格式：[元素1，原宿，元素3.....]）
public static void sort(数组):按照默认升序（从小到大）对数组的元素进行排序。
【注意事项】：
1.如果是数值，sort默认按照升序从小到大
2.如果是字符串，sort默认按照字母升序
3.如果是自定义的类，那么这个自定义的类需要有Comparable或者Comparator接口的支持
 */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String str = Arrays.toString(intArray);
        System.out.println(str);

        String[] array1 = {"aaa","ccc","bbb","eee"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        //倒叙打印字符串
        String strA = "adsgdjgdbjsabcbjhdsbafygbceb";
        char[] array = strA.toCharArray();

        //必须是一个数组，才能用Arrays.sort方法
        Arrays.sort(array);

        for(int i = array.length-1; i >= 0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
