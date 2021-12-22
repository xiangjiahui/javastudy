package com.xjh.Lambda;
//Lambda表达式保存无参无返回值
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        //使用Lambda表达式优化匿名内部类(前提是接口中只有一个抽象方法)
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
