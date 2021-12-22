package com.xjh.demo05.String;

import java.util.Scanner;

//输入一个字符串，判断其中的种类并计数
public class Demo09StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入字符串");
        String input = sc.next();

        int countUpper = 0; //大写字符计数
        int countLowper = 0; //小写字母计数
        int countNum = 0; //数字
        int countOther = 0;//其它

        char[] charArray = input.toCharArray();//将获得的字符串拆分成字符数组
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; //获得字符数组
            if('A' < ch && ch < 'Z'){
                countUpper++;
            }else if ('a' < ch && ch < 'z'){
                countLowper++;
            }else if (0 < ch && ch < 9){
                countNum++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字母个数："+countUpper);
        System.out.println("小写字母个数："+countLowper);
        System.out.println("数字个数："+countNum);
        System.out.println("其它字符个数："+countOther);
    }
}
