package CollectionsTools;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
          public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。(默认是升序)
    注意：sort<List<T> list>使用前提:
          被排序的集合里面存储的元素，必须实现Comparable,重写接口的方法compareTo定义排序的规则
    Comparable接口的排序规则：
         自己(this)-参数：升序
         参数-自己(this): 降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("张三",18));
        p.add(new Person("李四",20));
        p.add(new Person("王五",15));
        Collections.sort(p);
        System.out.println(p);
    }
}
