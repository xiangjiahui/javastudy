package com.xjh.MyAnnotation;

public @interface MyAnno {
    int value();
    MyAnno2 anno2();
    String name() default "张三";
    String[] strs();
    Person per();
}
