package CollectionsTools;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //public static <T> boolean addAll(Collection<T> c,T... elements):往集合中添加一些元素
        Collections.addAll(list,"a","b","c","d","e");

        //public static void shuffle(List<?> list)打乱顺序：打乱集合顺序
        Collections.shuffle(list);

        System.out.println(list);
    }
}
