package com.xjh.demo01.Scanner;

import java.util.Scanner;

public class Domo01Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("请输入第一个数字a：");
        int a = sc.nextInt();

        System.out.print("请输入第二个数字b：");
        int b = sc.nextInt();

        System.out.print("请输入第三个数c：");
        int c = sc.nextInt();

        int sum = a + b;
        System.out.println("a+b结果是："+sum);

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("最大值是："+max);

        String str = sc.next(); //  next()-->输入字符串
        System.out.println("输入的字符串是："+str);

    }
}
