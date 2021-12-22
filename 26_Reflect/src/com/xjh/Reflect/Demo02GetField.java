package com.xjh.Reflect;

import com.xjh.DoMain.Person;

import java.lang.reflect.Field;

/*
获取变量成员:
    Field[] getFields()获取public修饰的成员变量
    Field[] getField(String name)获取指定名称的public修饰的成员变量

    Field[] getDeclaredFields()获取所有的成员变量，不考虑修饰符
    Field[] getDeclaredField(String name)
 */
public class Demo02GetField {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
        Field[] fields = pc.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field a = pc.getField("a");
        //获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("========================");
        Field[] df = pc.getDeclaredFields();
        for (Field field : df) {
            System.out.println(field);
        }

        Field name = pc.getDeclaredField("name");
        name.setAccessible(true);//忽略访问权限的修饰符，即可访问私有的成员变量
        Object value2 = name.get(p);
        System.out.println(value2);
    }
}
