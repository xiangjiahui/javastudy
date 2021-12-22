package com.xjh.demo04.ArrayList;
//内容---->ArrayList基本内容和应用
import java.util.ArrayList;

/*
数组不能在过程中改变长度，ArrayList可以改变
ArrayList<E>,<E>---->代表泛型
泛型：指的是集合中存储的数值类型，一旦定义了类型，就只能使用这一个类型
【注意事项】：泛型只能是引用型，不能是基本类型

对于ArrayList来说，直接打印得到的不是地址值，而是[]中的内容
如果内容是空，得到的结果是[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //集合中全都是String类型的数据
        ArrayList<String> list = new ArrayList<>();

        //向集合当中添加内容，需要用到add方法
        list.add("向嘉晖");
        list.add("xxx");
        list.add("xxx");
        System.out.println(list);
    }
}
