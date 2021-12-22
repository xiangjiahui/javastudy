package com.xjh.demo03.Random;
/*
Random r = new Random();
r.nextInt();---->随机生成的数范围是整个int类型的范围。
r.nextInt(3)---->随机生成的数范围是左闭右开。也就是（[0,3)）-->0~2之间的数值
 */
import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机产生的数是："+num);
        System.out.println("————————————————————————————————");
        int a = r.nextInt(10);
        System.out.print("请输入您猜的数字：");
        int b = new Scanner(System.in).nextInt();
        if(b == a){
            System.out.println("恭喜您，猜对了！！！！");
        }else {
            System.out.println("真遗憾，您猜错了呢！！！");
        }
        System.out.println("随机产生的数是："+a);

        //遍历随机产生的数
//        for (int i = 0; i < 10; i++) {
//            int num1 = r.nextInt(10);
//            System.out.print(num1+" ");
//        }
    }
}
