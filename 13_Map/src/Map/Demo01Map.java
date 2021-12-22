package Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<K,V>集合
    Map集合的特点：
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素，key和value的数据类型可以相同，可以不同
        3.Map集合中的元素,key是不允许重复的，value是可以重复的
        4.Map集合中的元素,key和value是一一对应的
    java.util.HashMap<K,V>集合 implements Map<K,V>接口
    HashMap集合的特点：
        1.集合底层是哈希表(JDK1.8之前：数组+单项链表。JDK1.8之后:数组+单向链表/红黑树(链表的长度超过8))
        2.集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
    java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
    LinkedHashMap的特点：
        1.集合底层是哈希表+链表(保证迭代的顺序)
        2.集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

   /*
    public V put(K key, V value):把指定的键与指定的值添加到Map集合中
        返回值V:
            存储键值对的时候，key不重复，返回值是null
            存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
 */
    private static void demo01(){
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("小明", "小红1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("小明", "小红2");
        System.out.println("v2:"+v2);//v2:小红1

        System.out.println(map);//{小明=小红2}
    }

    /*
        public V remove(Object key):把指定的键所对应的键值对元素在Map集合中删除,返回被删除元素的值
        返回值V:
            key存在，value返回被删除的值
            key不存在,value返回null
     */
    private static void demo02(){
        Map<String,Integer> map = new HashMap<>();
        map.put("小明",168);
        map.put("小华",165);
        map.put("小军",178);
        System.out.println(map);//{小明=168, 小华=165, 小军=178}

        Integer v1 = map.remove("小明");
        System.out.println("v1:"+v1);//v1:168
        System.out.println(map);//{小华=165, 小军=178}

        Integer v2 = map.remove("华佗");
        System.out.println("v2:"+v2);//v2:null
    }

    /*
        public V get(Object key)根据指定的键在Map集合中获取对应的值
        返回值：
            key存在，返回对应的value值
            key不存在，返回null
     */
    private static void demo03(){
        Map<String,Integer> map = new HashMap<>();
        map.put("小明",168);
        map.put("小华",165);
        map.put("小军",178);

        Integer v1 = map.get("小明");
        System.out.println("v1:"+v1);//v1:168

        Integer v2 = map.get("大明");
        System.out.println("v2:"+v2);//v2:null
    }

    /*
        boolean containsKey(Object key):判断集合中是否包含指定的键
        包含返回true,不包含返回false
     */

    private static void demo04(){
        Map<String,Integer> map = new HashMap<>();
        map.put("小明",168);
        map.put("小华",165);
        map.put("小军",178);

        boolean b1 = map.containsKey("小明");
        System.out.println("b:"+b1);//b:true

        boolean b2 = map.containsKey("xxx");
        System.out.println("b2:"+b2);//b2:false
    }

}
