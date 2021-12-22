package com.xjh.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
java.io.BufferedWriter extends Writer
BufferedWriter:字符缓冲输出流
继承自父类的共性成员方法：
       void write(int c)写入单个字符。
       void write(char[] cbuf)写入字符数组。
       abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分。
       void write(String str)写入字符串。
       void write(String str, int off, int len)写入字符串的某一部分。
       abstract  void flush()刷新该流的缓冲———刷新缓冲区，流对象可以继续使用
       abstract  void close()关闭此流，但要先刷新它。———先刷新缓冲区，然后通知系统释放资源，流对象不可在被使用
构造方法：
        BufferedWriter(Writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流
        BufferedWriter(Writer out, int sz)创建一个使用给定大小输出缓冲区的新缓冲字符输出流
        参数：Writer out：字符输出流
             int sz：指定缓冲区的大小，不写默认大小
特有的成员方法：void newLine()写入一个行分隔符。会根据不同的操作系统，获取不同的分隔符
使用步骤：
        1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        2.调用字符缓冲输出流对象中的方法write，把数据写入到内存缓冲区当
        3.释放资源
 */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\BufferedStream\\b.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("黑马程序员");
            bw.newLine();
        }
        bw.close();
    }
}
