package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);

        coll.remove("张三");
        System.out.println(coll);

        boolean b1 = coll.contains("张三");//判断集合中是否包含字符，包含返回true，不包含返回false
        boolean b2 = coll.contains("王五");
        System.out.println("b1:"+b1);
        System.out.println("b2:"+b2);

        boolean empty = coll.isEmpty();//判断集合是否为空，为空返回true，不为空返回false
        System.out.println(empty);

        int size = coll.size();//集合长度
        System.out.println(size);

        Object[] arr = coll.toArray();//把集合中元素，存储到数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();
        System.out.println(coll);
    }
}
