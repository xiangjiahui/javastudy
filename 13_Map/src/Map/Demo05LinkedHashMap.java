package Map;

import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    底层原理：
        哈希表+链表(记录元素的顺序)
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        System.out.println(linked);//key不允许重复，有序 {a=d, c=c, b=b}
    }
}
