package com.xjh.demo04.ArrayList;
//内容---->ArrayList集合常用的几个方法
import java.util.ArrayList;
/*
ArrayList当中常用的方法有：
public boolean add（E e）:向集合当中添加元素，参数的类型和泛型一致。返回值代表是否添加成功
【备注】：对于ArrayList集合，add添加动作是一定成功的，所以返回值可加不加。
         但是对于其它集合来说，不一定添加成功
public E get(int index):向集合当中获取元素，参数是索引编号(索引编号从0开始)，返回值就是对用位置的元素

public E remove(int index):从集合当中删除，参数是索引编号，返回值就是被删除的元素

public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

//        Boolean success = list.add("向嘉晖");
//        System.out.println(list);
//        System.out.println("添加是否成功："+success);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("贾乃亮");
        list.add("张二河");

        //获取集合元素
        String name = list.get(2);
        System.out.println(name);   //贾乃亮

        //删除集合元素
        String remove = list.remove(3);
        System.out.println("被删除的是："+remove);
        System.out.println("删除后剩余名字："+list);

        //获取集合的尺寸长度
        int size = list.size();
        System.out.println(size);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
