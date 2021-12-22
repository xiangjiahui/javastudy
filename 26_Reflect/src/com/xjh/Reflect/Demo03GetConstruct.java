package com.xjh.Reflect;

import com.xjh.DoMain.Person;

import java.lang.reflect.Constructor;

/*
获取构造方法:
    Constructor<?>[] getConstructors()
    Construct<T> getConstructor(类<?>...parameterTypes)

    Constructor<?>[] getDeclaredConstructors()
    Construct<T> getDeclaredConstructor(类<?>...parameterTypes)
 */
public class Demo03GetConstruct {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Constructor<Person> cons = personClass.getConstructor(String.class, int.class);
        System.out.println(cons);
        //创建对象
        Person person = cons.newInstance("张三",23);
        System.out.println(person);

//        Person person1 = personClass.newInstance();
    }
}
