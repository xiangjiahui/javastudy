package com.xjh.IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.Writer:写入字符流的抽象类
共性成员的方法:
       void write(int c)写入单个字符。
       void write(char[] cbuf)写入字符数组。
       abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分。
       void write(String str)写入字符串。
       void write(String str, int off, int len)写入字符串的某一部分。
       abstract  void flush()刷新该流的缓冲———刷新缓冲区，流对象可以继续使用
       abstract  void close()关闭此流，但要先刷新它。———先刷新缓冲区，然后通知系统释放资源，流对象不可在被使用
java.io.FileWriter extends OutputStreamWriter extends Writer
FileWriter：文件字符输出流
作用：把内存中字符数据写入到文件中
构造方法：
        FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象。
        FileWriter(String fileName)根据给定的文件名构造一个 FileWriter 对象。
参数：写入数据的目的地
构造方法的作用：
            1.会创建一个FileWriter对象
            2.会根据构造方法中的文件/文件的路径，创建文件
            3.会把FileWriter对象指向创建好的文件
字符输出流的步骤(重点):
            1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
            2.使用FileWriter中的方法write，把数据写入到内存缓冲区(字符转换为字节的过程)
            3.使用FileWriter中的方法flush，把内存缓冲区的数据刷新到文件中
            4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\d.txt");
        fw.write("a");
        fw.flush();//此方法可不使用,close方法会先刷新缓冲区
        fw.close();
    }
}
