package com.xjh.ArrayandMethodload;

/*
方法重载（overload）：多个方法名称相同，参数列表不同
方法重载与下列因素有关：
1.参数个数不同
2.参数类型顺序不同
3.参数的多类型的顺序不同
方法重载与下列因素不同
1.参数名称无关
2.方法的返回值类型无关
 */
public class MethodOverLoad {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)11,(short)11));
        System.out.println(isSame(11,13));
        System.out.println(isSame(20L,30L));
    }

    public  static boolean isSame(byte a,byte b){
        System.out.println("执行byte类型");
        boolean same;
        if(a == b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("执行short类型");
        boolean same = a == b ? true: false;
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("执行int类型");
        return a == b;
    }

    public static boolean isSame(long a,long b){
        System.out.println("执行long类型");
        if(a == b){
            return true;
        }else{
            return false;
        }
    }
}
