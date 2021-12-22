package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo06MapTest {
    public static void main(String[] args) {
        //1.使用Scanner对象获取输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char[] chars = str.toCharArray();//字符串转换为字符数组

        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        Map<Character,Integer> map = new HashMap<>();

        //3.遍历字符串，获取每一个字符
        for (char c : chars) {
            //4.使用获取到的字符,去Map集合判断是否存在
            if(map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                //key不存在
                map.put(c,1);
            }
        }

        //5.遍历Map集合,输出结果
        Set<Character> set = map.keySet();
        for (Character key : set) {
            Integer value = map.get(key);
            System.out.println(key +"="+value);
        }
    }
}
