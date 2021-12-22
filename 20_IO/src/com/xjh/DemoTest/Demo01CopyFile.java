package com.xjh.DemoTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制练习:一读一写
文件复制的步骤:
            1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
            2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
            3.使用字节输入流对象中的方法read读取文件
            4.使用字节输出流中的方法write,把读取到的字节写入到目的地文件中
            5.释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        byte[] bytes = new byte[1024*58];//图片文件大,需要定义空间较大的数组

        FileInputStream fis = new FileInputStream("D:\\2.jpg");
        int read = fis.read(bytes);

        FileOutputStream fos = new FileOutputStream("E:\\2.jpg");
        fos.write(bytes);

//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(bytes))!= -1){
//            fos.write(bytes,0,len);
//        }

        //先关闭写,在关闭读
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");
    }
}
