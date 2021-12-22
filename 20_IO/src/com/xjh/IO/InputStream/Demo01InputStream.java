package com.xjh.IO.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类
定义了所有子类共性的方法:
     abstract  int read()从输入流中读取数据的下一个字节
     int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
     void close()关闭此输入流并释放与该流关联的所有系统资源
java.io.FileInputStream extends InputStream
FileInputStream:文件字节输入流
把硬盘文件中的数据,读取到内存中使用
构造方法:
    FileInputStream(File file)
    FileInputStream(String name)
参数:读取文件的数据源
    String name:文件的路径
    File file:文件
构造方法的作用:
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指定构造方法中要读取的文件
字节输入流的使用步骤:
                1.创建一个FileInputStream对象,构造方法中绑定要读取的数据源
                2.使用FileInputStream对象中的方法read,读取文件
                3.释放资源
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Study\\20_IO\\src\\com\\xjh\\a.txt");
        //int read()读取文件中的一个字节并返回,每多读取一次都往后读取一位,读取到文件的末尾返回-1
//        int read = fis.read();

        /*
        布尔表达式(len = fis.read())!= -1含义
                1.fis.read():读取一个字节
                2.len = fis.read():把读取到的字节赋值给变量len
                3.(len = fis.read())!= -1:判断变量是否不等于-1
         */
        //循环读取了3次
        int len = 0;
        while ((len = fis.read())!= -1){
            System.out.println((char) len);
        }

        fis.close();
    }
}
