package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合第一种遍历方法：通过键找值的方式
    Map集合中的方法：
            Set<K> keySet():返回此映射中包含的键的Set视图
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("小明",168);
        map.put("小华",165);
        map.put("小军",178);

        //1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历Map集合，获取Map集合中每一个key
        //使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            //通过Map集合中的方法get(key),通过key找到value
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" +value);
        }

        System.out.println("======================");

        //使用foreach循环
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" +value);
        }
    }
}
