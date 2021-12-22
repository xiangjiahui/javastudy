package com.xjh.demo03.Random;

import java.util.Random;

public class Demo05Random {
    public static void main(String[] args) {
        //取范围是[1,n]的随机值。[1,n)整体加1即可
        Random r = new Random();
        int n = 20;
        for (int i = 0; i < 20; i++) {
            //本来范围是[0,n),整体加1之后变成了[1,n+1)--->[1,n]
            int num = r.nextInt(n) + 1;     //[0,20)---->[1,20]
            System.out.print(num+" ");
        }
    }
}
