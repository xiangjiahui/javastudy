package Map;

import java.util.*;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
            作为key的元素，必须重写hashCode方法和equals方法,以保证key唯一
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        demo01();
        System.out.println("======================");
        demo02();
    }

    private static void demo01(){
        HashMap<String,Person> map = new HashMap<>();
        map.put("上海",new Person("张三",18));
        map.put("北京",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("上海",new Person("赵六",18));

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Person value = map.get(key);
            System.out.println(key +"-->"+value);
        }

        System.out.println("============================");

        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key +"-->"+value);
        }
    }

    private static void demo02(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("金闪闪",20),"神都");
        map.put(new Person("亚瑟王",18),"不列颠大陆");
        map.put(new Person("狂战士",25),"霓虹国");
        map.put(new Person("金闪闪",20),"天界");

        Set<Map.Entry<Person, String>> set = map.entrySet();

        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"-->"+value);
        }

        System.out.println("====================");

        Iterator<Map.Entry<Person, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Person, String> entry = it.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"-->"+value);
        }
    }
}
