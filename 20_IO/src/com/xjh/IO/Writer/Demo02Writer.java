package com.xjh.IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流写数据的其它方法:
       void write(char[] cbuf)写入字符数组。
       abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分。
       void write(String str)写入字符串。
       void write(String str, int off, int len)写入字符串的某一部分。
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\e.txt");

        char[] c = {'a','b','c','d','e'};
        fw.write(c);//abcde

        //abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分。
        fw.write(c,3,2);//de

        //void write(String str)写入字符串。
        fw.write("Java学习");

        //void write(String str, int off, int len)写入字符串的某一部分
        fw.write("黑马程序员",2,3);

        fw.close();
    }
}
