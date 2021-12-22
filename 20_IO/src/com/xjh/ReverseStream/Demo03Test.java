package com.xjh.ReverseStream;

import java.io.*;

/*
练习：转换文件编码
        将GBK编码的文件转换为UTF-8编码的文件
分析：
    1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表GBK
    2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表UTF-8
    3.使用InputStreamReader对象中的方法read读取文件
    4.使用OutputStreamWriter对象中的方法write把读取的数据写入到文件中
    5.释放资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException {
        // 1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Test\\我是GBK格式的文件.txt"),"GBK");
        //2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Test\\我是UTF_8格式的文件.txt"),"UTF-8");
        // 3.使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read())!= -1){
            osw.write(len);
        }

        osw.close();
        isr.close();
    }
}
