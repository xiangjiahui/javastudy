package com.xjh.demo03.LamdaTest;
//函数时接口作为方法的参数案例
public class Demo01Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
            }
        });

        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
        });
    }

    public static void startThread(Runnable run){
        new Thread(run).start();
    }
}
