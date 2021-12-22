package com.xjh.demo12.System;

import java.util.Arrays;

/*
System类的常用方法:
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                     从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
参数：
        src - 源数组。
        srcPos - 源数组中的起始位置。
        dest - 目标数组。
        destPos - 目标数据中的起始位置。
        length - 要复制的数组元素的数量。
public static long currentTimeMillis() 返回以毫秒为单位的当前时间。
 */
public class SystemMethod {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    public static void demo01(){
        long s = System.currentTimeMillis();
        for (int i = 1; i <=9999 ; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");
    }

    public static void demo02(){
        //定义源数组
        int[] src = {1,2,3,4,5};
        //定义目标数组
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+Arrays.toString(dest));
    }
}
