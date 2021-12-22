package com.xjh.demo03.Random;

import java.util.Random;
import java.util.Scanner;

public class Demo06RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(101);

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.print("请输入猜的数字：");
            int num = sc.nextInt();
            if(num > a){
                System.out.println("数字大了，请重试！！！");
                System.out.print("\n");
            }else if(num < a){
                System.out.println("数字小了，请重试！！！");
                System.out.print("\n");
            }else {
                System.out.println("恭喜您，猜中了！！！");
                return;
            }
        }
        System.out.println("您猜了这么多次数还猜不中，太low了，游戏结束！！！");

//        while (true){
//            System.out.print("请输入猜的数字：");
//            int num = sc.nextInt();
//            if(num > a){
//                System.out.println("数字大了，请重试！！！");
//                System.out.print("\n");
//            }else if(num < a){
//                System.out.println("数字小了，请重试！！！");
//                System.out.print("\n");
//            }else {
//                System.out.println("恭喜您，猜中了！！！");
//                break;
//            }
//        }
//        System.out.println("游戏结束！！！");
    }
}
