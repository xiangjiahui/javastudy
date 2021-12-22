package com.xjh.demo11.ArrayMethodReference;
//数组构造器的引用
public class DemoMain {
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        int[] arr = createArray(10,(int len)->{
            return new int[len];
        });
        System.out.println(arr.length);

        /*
        已知创建的就是int[]数组
        数组的长度也是已知的
        就可以使用方法引用
        int[]引用new，根据参数传递的长度来创建数组
         */
        int[] array = createArray(10, int[]::new);
        System.out.println(array.length);
    }
}
