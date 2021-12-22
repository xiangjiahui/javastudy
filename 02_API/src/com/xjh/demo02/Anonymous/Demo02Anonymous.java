package com.xjh.demo02.Anonymous;

/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称（）；
【注意事项】：匿名对象只能使用唯一的一次，下次再用就不得不再创建一个新对象
【使用建议】：如果确定右一个对象只需要使用唯一的一次，就可以用匿名对象。
 */

public class Demo02Anonymous {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "古娜拉黑暗之神";
        p.showName();

        new Person().name = "王七麟";
        new Person().showName();//名字是：Null
    }
}
