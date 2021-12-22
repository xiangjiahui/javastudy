package Lsit;

import java.util.LinkedList;

/*
java.util.LinkedList集合 implements List接口
LinkedList集合的特点：
                1.底层是一个链表结构：查询慢，增删快
                2.里面包含了大量操作首尾元素的方法
                注意：使用LinkedList特有的方法，不能使用多态
           1.public void addFirst(E e): 将指定元素插入此列表的开头。
           2.public void addLast(E e): 将指定元素添加到此列表的结尾。此方法等效于add
           3.public E getFirst(): 返回此列表的第一个元素。
           4.public E getLast(): 返回此列表的最后一个元素。
           5.public E removeFirst(): 移除并返回此列表的第一个元素。
           6.public E removeLast(): 移除并返回此列表的最后一个元素。

           7.public void push(E e): 将元素【推入】此列表所表示的堆栈。此方法等效于addFirst
           8.public E pop(): 从此列表所表示的堆栈处【弹出】一个元素。此方法等效于removeFirst

           9.public boolean isEmpty():如果列表不包含元素，则返回true

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        demo01();
        System.out.println("——————————————");

        demo02();
        System.out.println("———————————————");

        demo03();
    }

    public static void demo01(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("原数据："+linked);

        //public void addFirst(E e): 将指定元素插入此列表的开头。
        //public void addLast(E e): 将指定元素添加到此列表的结尾。
        linked.addFirst("a");
//        linked.push("a");
        linked.addLast("e");
        System.out.println("添加后的数据："+linked);
    }

    public static void demo02(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("原数据："+linked);

        //public E getFirst(): 返回此列表的第一个元素。
        //public E getLast(): 返回此列表的最后一个元素。
        String first = linked.getFirst();
        System.out.println("第一个元素："+first);
        String last = linked.getLast();
        System.out.println("最后一个元素："+last);
    }

    public static void demo03(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("原数据："+linked);

        //public E removeFirst(): 移除并返回此列表的第一个元素。
        //public E removeLast(): 移除并返回此列表的最后一个元素。
        String removeFirst = linked.removeFirst();
        System.out.println("移除的第一个元素："+removeFirst);
        System.out.println("剩余的元素："+linked);

        String removeLast = linked.removeLast();
        System.out.println("移除的最后一个元素："+removeLast);
        System.out.println("剩余的元素："+linked);
    }
}
