package com.xjh.Lambda;

import java.util.Arrays;

//Lambda表达式保存有参数有返回值
public class Demo02Lambda {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("小梦",18),
                new Person("小明",20),
                new Person("小红",19),
        };

/*        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式,简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)-> {
            return o1.getAge() - o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
