package com.xjh.demo07.StaticMethodReference;
/*
通过类名引用静态成员方法
使用前提是类已经存在，静态成员方法也已经存在
 */
public class Demo01StaticMethodReference {
    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int num = method(-10,(int n)->{
            return Math.abs(n);
        });
        System.out.println(num);

        int num2 = method(-10, Math::abs);
        System.out.println(num2);
    }
}
