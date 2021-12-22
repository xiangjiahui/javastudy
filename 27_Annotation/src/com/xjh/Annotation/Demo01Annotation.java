package com.xjh.Annotation;
/*
注解：说明程序。给计算机看的
    作用分类：
        1.编写文档：通过代码里标识的注解生成文档(生成doc文档)
        2.代码分析(主要学习和使用):通过代码里标识的注解对代码进行分析(使用反射)
        3.编译检查:通过代码里标识的注解让编译器能够实现基本的编译检查(例如Override)
JDK中预定义的一些注解:
    @Override:检测方法重写
    @Deprecated:该注解标注的内容，表示已过时
    @SuppressWarning:压制警告。@SuppressWarning("all")(使用该注解，边框上的黄色警告都会消失)
 */
public class Demo01Annotation {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show(){

    }

    public void show2(){
        show();
    }

    @SuppressWarnings("all")
    public void add(){

    }
}
