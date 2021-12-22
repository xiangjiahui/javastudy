package com.xjh.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.BufferedOutputStream extends OutputStream
BufferedOutputStream:字节缓冲输出流
继承自父类的共性成员方法：
    public void close()关闭此输出流并释放与此流有关的所有系统资源
    public void flush()刷新此输出流并强制写出所有缓冲的输出字节
    public void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流
    public void write(byte[] b, int off, int len)将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
    public abstract  void write(int b)将指定的字节写入此输出流
构造方法：
    BufferedOutputStream(OutputStream out)创建一个新的缓冲输出流，以将数据写入指定的底层输出流
    BufferedOutputStream(OutputStream out,int size)创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入
                                                    指定的底层输出流
参数：
     OutputStream out:字节输出流
            可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
     int size：指定缓冲区内部缓冲区的大小，不指定默认
使用步骤(重点):
        1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
        2.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象
        3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据，刷新到文件中
        5.释放资源(会先调用flush方法刷新数据，第四步可以省略)
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Study\\20_IO\\src\\com\\xjh\\BufferedStream\\a.txt");

        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入到内部缓冲区中".getBytes());
        bos.close();
    }
}
