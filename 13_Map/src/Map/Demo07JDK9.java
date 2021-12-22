package Map;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性：
        List接口，Set接口，Map接口：里面增加了一个静态方法of，可以给集合一次性添加多个元素
        static<E> List<E> of(E..elements)
        使用前提：当集合中存储的元素的个数已经确定，不在改变时使用
        注意：
            1.of方法只适用于 List接口，Set接口，Map接口，不适用于接口的实现类
            2.of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
            3.Set和Map接口在调用方法的时候，不能有重复的元素，否则会抛出异常
 */
public class Demo07JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "c", "b", "e", "d");
        System.out.println(list);

        Set<Integer> set = Set.of(1, 2, 6, 3, 4, 5);
        System.out.println(set);

        Map<String, Integer> map = Map.of("张三", 18, "王五", 29, "赵四", 23);
        System.out.println(map);
    }
}
