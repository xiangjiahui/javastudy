/*
使用动态化数组时，其中的元素会自动拥有一个默认值。规则如下：
1.整数类型。默认为0
2.浮点类型。默认为0.0
3.字符类型。默认为'\u0000'
4.布尔类型。默认为false
5.引用类型。默认为null
【注意事项】；使用静态化数组时，也有默认值，只不过被系统替换成了括号中的具体的数值。
 */
package com.xjh.ArrayandMethodload;

public class ArrayUse {
    public static void main(String[] args) {
        int [] arrayA = new int[] {10,20,30};
        System.out.println(arrayA[0]);      //数组索引从0开始，到n-1结束

        int num = arrayA[1];        //可将数组当中的某一个元素赋值给变量
        System.out.println(num);
        System.out.println("————————————————————————");

        int [] array = new int[3];
        System.out.println(array[0]);

        array[1] = 123;     //将123赋值给数组中的某一个值
        System.out.println(array[1]);
    }
}
