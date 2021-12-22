package com.xjh.demo04.ArrayList;
import java.util.ArrayList;
//内容--->ArrayList集合保存基本类型数据
/*
如果ArrayList集合想要保存基本数据类型，就必须使用基本类型对应的“包装类”。
基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean
 */
public class Demo04ArrayListSaveBasicClass {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();

        listA.add(100);
        listA.add(200);
        listA.add(300);
        System.out.println(listA);
        int num = listA.get(1);
        System.out.println("第一个索引值："+num);
    }
}
