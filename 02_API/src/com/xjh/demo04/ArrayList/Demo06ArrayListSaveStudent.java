package com.xjh.demo04.ArrayList;

import java.util.ArrayList;

public class Demo06ArrayListSaveStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("小明",18);
        Student s2 = new Student("小华",18);
        Student s3 = new Student("小红",15);
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//        s1.setName("小明");
//        s1.setAge(18);
//        s2.setName("小华");
//        s2.setAge(18);
//        s3.setName("小红");
//        s3.setAge(15);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student num = list.get(i);
            System.out.println(num.getName()+" "+num.getAge());
        }
    }
}
