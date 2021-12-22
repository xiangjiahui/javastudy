package com.xjh.DefineclassandUse;

public class Phone {        //定义一个手机类
    String brand = "小米";   //品牌变量
    double price = 1800;    //价格变量
    String color = "黑色";  //颜色变量

    public void call(String who){
        System.out.print("给"+who+"打电话。");
    }

    public void sendMessage(){      //无参数，当作群发短信
        System.out.println("并且发短信告诉他，他已经完蛋了！");
    }
}
