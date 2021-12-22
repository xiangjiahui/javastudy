package com.xjh.demo09.ThisMethodReference;

public class Husband {
    public void buyHouse(){
        System.out.println("买套房");
    }

    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
