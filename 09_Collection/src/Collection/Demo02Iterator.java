package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
    两个常用的方法：
                boolean hasNext（）如果仍有元素可以迭代，则返回true
                            判断集合中还有没有下一个元素，有就返回true，没有就返回false
                E next（）返回迭代的下一个元素
                            取出集合中的下一个元素
     Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
     Collection接口中有一个方法，iterator（），这个方法返回的就是迭代器的实现类对象
                Iterator<E> iterator()  返回在此 collection的元素上进行迭代的迭代器
     迭代器的使用步骤（重点）：
                1.使用集合中的方法iterator获取迭代器的实现类对象，使用iterator接口接收（多态）
                2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
                3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        //1.使用集合中的方法iterator获取迭代器的实现类对象，使用iterator接口接收（多态）
        //注意：迭代器也是有泛型的，跟着集合走，集合什么泛型，迭代器也是什么泛型
        Iterator<String> it = coll.iterator();

        //使用迭代代码重复，可用循环
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("————————————————————————————————————");

        for (Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String next = it2.next();
            System.out.println(next);
        }

//        //2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        boolean b = it.hasNext();//没有返回false
//        System.out.println(b);
//
//        //3.使用Iterator接口中的方法next取出集合中的下一个元素
//        String s = it.next();//没有下一个元素会抛出异常
//        System.out.println(s);
    }
}
