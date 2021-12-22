package com.xjh.ArrayandMethodload;

public class Method {
    public static void main(String[] args) {
       // sum(10,20);     //单独调用
        System.out.print(sum(10,20));     //打印调用
        System.out.print("\n");
        int number = sum(50,200);         //赋值调用
        System.out.println("变量的值："+number );

        System.out.println("=============");

        sum2(20,30);
        System.out.println("=============");

        System.out.println("结果是："+getSum());

        System.out.println("=============");
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }
    public static int sum(int a,int b){     //有返回值
        int result;
        result = a + b;
        return result;
    }

    public  static void sum2(int i,int j){
        int re = i+j;
        System.out.println("运算结果："+re);
    }

    public static String getSum(){
        int sum = 0;
        String sums="sum =";
        int i;
        for (i = 1; i <=100; i++) {
            sum+= i;
            if(i==100){
                sums += i;
            }else{
                sums += i + "+";
            }

        }
        sums = sums+"="+sum;

        return sums;
    }

    //定义一个方法比较两数是否相同---->【是否】即用boolean型方法
    public static  boolean isSame(int a,int b){
       //方法1
        boolean same;
        if(a==b){
            same = true;
        }else{
            same = false;
        }
        return same;

        //方法2
//        boolean same = a==b ? true:false;
//            return same;
        //方法3
//       boolean same = a==b;
//        return same;
//        //方法4
//       return a==b;
    }
}
