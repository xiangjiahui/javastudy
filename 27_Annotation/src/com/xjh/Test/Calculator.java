package com.xjh.Test;

public class Calculator {
    @Check
    public void add(){
        System.out.println("1 + 0 ="+(1 + 0));
    }
    @Check
    public void sub(){
        System.out.println("1 - 0 ="+(1 -0));
    }
    @Check
    public void multiply(){
        System.out.println("1 * 0 ="+(1 * 0));
    }
    @Check
    public void division(){
        System.out.println("1 / 0 ="+(1 / 0));
    }

    public void show(){
        System.out.println("永无bug......");
    }
}
