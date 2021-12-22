package com.xjh.demo06.ObjectMethodReference;
/*
通过对象名引用成员方法
使用前提是对象名是已经存在的，成员方法也是已经存在的
就可以使用对象名引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
