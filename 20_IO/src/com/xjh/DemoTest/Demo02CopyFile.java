package com.xjh.DemoTest;

import java.io.*;

/*
文件复制练习：一读一写
文件复制的步骤：
        1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        3.使用字节缓冲输入流对象中的方法read，读取文件
        4.使用字节缓冲输出流对象中的方法write，把读取的数据写入到内部缓冲区中
        5.释放资源
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\2.jpg"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\2.jpg"));

/*        int len = 0;
        while ((len = bis.read())!= -1){
            bos.write(len);
        }*/

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!= -1){
            bos.write(bytes);
        }
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");
    }
}
