package com.xjh.demo04.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
定义一个大集合存储20个随机数，筛选出其中的偶数元素，存入小集合当中
 */
public class Demo08ArrayListRetun {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {      //产生20个随机数，放入大集合中
            int num = r.nextInt(50) + 1;    //[1,50]
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);   //赋值调用
        System.out.println("偶数的总数是："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+" ");
        }
    }
    
    //方法接受大集合参数，返回小集合参数
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
