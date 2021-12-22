package com.xjh.demo01.FunctionalInterface;
/*
函数式接口：有且只有一个抽象方法的接口，接口中可包含其它方法
@FunctionalInterface注解
作用：可以检测接口是否是一个函数式接口
        是：编译成功
        否：编译失败(接口中没有抽象方法或抽象方法的个数多于一个)
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}
