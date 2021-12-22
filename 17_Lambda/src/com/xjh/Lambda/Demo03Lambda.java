package com.xjh.Lambda;
//Lambda有参数有返回值练习,计算两数的和
public class Demo03Lambda {
    public static void main(String[] args) {
        calSum(10, 20, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });

        calSum(120,130,(int a,int b)-> {
            return a + b;
        });
    }

    public static void calSum(int a,int b,Calculator c){
        int result = c.cal(a,b);
        System.out.println(result);
    }
}
