package Lsit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.list接口 extends Collection接口
List接口的特点：
            1.有序的集合，存储元素和取出元素的顺序是一致的
            2.有索引，包含了一些带索引的方法
            3.允许存储重复的元素
List接口中带索引的方法(特有)：
            1.public void add(int index ,E element):将指定的元素，添加到该集合的指定位置上
            2.public E get(int index):返回集合中指定位置的元素
            3.public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
            4.public E set(int index):用指定元素替换集合中指定位置的元素，返回值是更新前的元素
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");

        //public void add(int index ,E element):将指定的元素，添加到该集合的指定位置上
        //在c和e之间添加d
        list.add(3,"d");
        System.out.println(list);

        //public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
        String removeE = list.remove(0);
        System.out.println("被移除的元素："+removeE);
        System.out.println(list);

        //public E set(int index):用指定元素替换集合中指定位置的元素，返回值是更新前的元素
        String setE = list.set(0, "B");
        System.out.println("被替换的元素："+setE);
        System.out.println(list);

        //public E get(int index):返回集合中指定位置的元素
        //List集合遍历有三种方式
        //使用普通for循环
        for (int i = 0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("——————————————————————————————————————");
        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("——————————————————————————————————————");
        //使用foreach循环
        for(String s : list){
            System.out.println(s);
        }
    }
}
