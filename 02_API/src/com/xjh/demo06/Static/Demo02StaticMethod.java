package com.xjh.demo06.Static;
/*
一旦使用了static修饰成员方法，就成了静态方法。静态方法不属于对象，而是属于类。
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
【重点】：
1.静态不能直接访问非静态(原因是：内存当中【先】有的静态，【后】有的非静态内容)
2。静态方法中不能用this关键字(原因：this代表当前对象，通过谁调用的方法，谁就是当前对象)
 */
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass cls = new MyClass();
        cls.method();//没有static关键字内容的方法

//        cls.staticMethod();正确，但不推荐
        MyClass.staticMethod();//static关键字修饰的方法可以通过类名直接调用,推荐写法
    }
}
