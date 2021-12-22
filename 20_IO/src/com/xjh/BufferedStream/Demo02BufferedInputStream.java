package com.xjh.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.BufferedInputStream extends InputStream
BufferedInputStream:字节缓冲输入流
继承自父类的共性成员方法：
     abstract  int read()从输入流中读取数据的下一个字节
     int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
     void close()关闭此输入流并释放与该流关联的所有系统资源
构造方法:
        BufferedInputStream(BufferedInputStream in)
        BufferedInputStream(BufferedInputStream in,int size)
使用步骤:
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象
        3.使用BufferedInputStream对象中的方法read，读取文件
        4.释放资源
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Study\\20_IO\\src\\com\\xjh\\BufferedStream\\a.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
/*        int len = 0;
        while ((len = bis.read())!= -1){
            System.out.println((char)len);
        }*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
