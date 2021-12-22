package com.xjh.demo04.ArrayList;

import java.util.ArrayList;

//定义以指定格式打印集合的方法
public class Demo07PrintArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("殷梨亭");
        list.add("张翠山");
        list.add("张无忌");

        printArray(list);
    }
    /*
    定义方法三要素：
    1.返回值类型  2.方法名称   3.参数列表
     */
    public static void printArray(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(i == list.size()-1){
                System.out.println(s + "}");
            }else{
                System.out.print(s + "@");
           }
        }
    }
}
