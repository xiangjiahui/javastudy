package com.xjh.demo02.Lambda;
/*
Lambda优化日志案例
Lambda的特点:延迟加载
使用前提:必须存在函数式接口
 */
public class Demo02Logger {
    public static void main(String[] args) {
        //定义三个日志信息
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";

/*        showLog(2,()->{
            return s1+s2+s3;
        });*/
        //满足条件才会执行后面的语句，不满足则不执行，所以就不存在性能浪费的问题

        showLog(1,()->{
            return s1+s2+s3;
        });
    }

    public static void showLog(int level,MessageBuilder mb){
        if(level == 1){
            System.out.println(mb.builderMessage());
        }
    }
}
