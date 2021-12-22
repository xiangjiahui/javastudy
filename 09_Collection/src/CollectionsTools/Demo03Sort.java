package CollectionsTools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> void sort(List<T> list, Comparator<? super T>):将集合中元素按照指定规则排序
    Comparator和Comparable的区别：
        Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判，比较两个
    Comparator排序规则：
            o1 - o2:升序
            o2 - o1:降序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println("排序前："+list01);

        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序
//                return o2 - o1;//降序
            }
        });
        System.out.println("排序后："+list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("张三",18));
        list02.add(new Student("李四",20));
        list02.add(new Student("王五",17));
        System.out.println("按年龄排序前："+list02);

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
          //扩展：了解
//        Collections.sort(list02, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按年龄升序排序
//                int result = o1.getAge() - o2.getAge();
//                if (result == 0){
//                    //如果年龄相同，再按姓名的第一个字排序
//                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
//                }
//                return result;
//            }
//        });

        System.out.println("按年龄排序后："+list02);
    }
}
