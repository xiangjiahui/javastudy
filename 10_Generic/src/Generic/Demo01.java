package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型是一种未知的数据类型，当我们不知道使用什么类型的数据类型时，可以使用泛型
泛型也可以看作是一个变量，用来接受数据类型
E e: Element 元素
T t: Type 类型
 */
public class Demo01 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    创建集合对象，不使用泛型
    好处：集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    弊端：不安全，会引发异常
     */
    private static void demo01(){
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add(1);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //会抛出ClassCastException类型转换异常，不能把Integer类型转换成String类型
            String s = (String)obj;
            System.out.println(s.length());
        }
    }

    /*
    创建集合对象，使用泛型
    好处：1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
         2.把运行期异常(代码运行之后会抛出的异常)，提升到了编译期(写代码时会报错)
    弊端：泛型是什么类型，只能存储什么类型的数据
     */
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+"-->"+s.length());
        }
    }
}
