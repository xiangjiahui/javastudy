package com.xjh.Reflect;

import com.xjh.DoMain.Person;

import java.lang.reflect.Method;

/*
获取成员方法:
    Method[] getMethods()
    Method getMethod(String name,类<?>...parameterTypes)
        参数:name是指定的方法名   类<?>...parameterTypes:方法的参数列表
    Method[] getDeclaredMethods()
    Method getDeclaredMethod(String name,类<?>...parameterTypes)
 */
public class Demo04GetMethod {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat.invoke(p);

        Method eat2 = personClass.getMethod("eat", String.class);
        eat2.invoke(p,"饭");

        //获取方法名称
        String name = eat.getName();
        System.out.println(name);

        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
