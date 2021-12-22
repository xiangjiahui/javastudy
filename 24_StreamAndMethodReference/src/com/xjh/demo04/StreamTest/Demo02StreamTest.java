package com.xjh.demo04.StreamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
练习：集合元素处理(Stream流处理方式)
   现有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环(或forEach)依次进行以下若干操作步骤
   1.第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中
   2.第一个队伍筛选之后只要前3个人;存储到一个新集合中
   3.第二个队伍只要姓张的成员姓名;存储到一个新集合中
   4.第二个筛选之后不要前2个人;存储到一个新集合中
   5.将两个队伍合并为一个队伍;存储到一个新集合中
   6.根据姓名创建Person对象;存储到一个新集合中
   7.打印整个队伍的Person对象信息
 */
public class Demo02StreamTest {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("石破天");
        list1.add("石中玉");
        list1.add("老子");
        list1.add("庄子");
        list1.add("洪七公");

        //1.第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中
        //2.第一个队伍筛选之后只要前3个人;存储到一个新集合中
        Stream<String> oneStream = list1.stream().filter(name->name.length() == 3).limit(3);

        //第二支队伍
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("赵丽颖");
        list2.add("张三丰");
        list2.add("尼古拉斯赵四");
        list2.add("张天爱");
        list2.add("张二河");

        //3.第二个队伍只要姓张的成员姓名;存储到一个新集合中
        //4.第二个筛选之后不要前2个人;存储到一个新集合中
        Stream<String> twoStream = list2.stream().filter(name -> name.startsWith("张")).skip(2);

        //5.将两个队伍合并为一个队伍;存储到一个新集合中
        //6.根据姓名创建Person对象;存储到一个新集合中
        //7.打印整个队伍的Person对象信息
        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(name-> System.out.println(name));
    }
}
