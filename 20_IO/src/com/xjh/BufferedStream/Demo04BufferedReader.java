package com.xjh.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
java.io.BufferedReader extends Reader
继承自父类的共性成员方法：
    int read()读取单个字符
    int read(char[] cbuf)将字符读入数组
    abstract  void close()关闭该流并释放与之关联的所有资源
构造方法：
    BufferedReader(Reader in)创建一个使用默认大小输入缓冲区的缓冲字符输入流。
    BufferedReader(Reader in, int sz)创建一个使用指定大小输入缓冲区的缓冲字符输入流
特有的成员方法：String readLine()读取一个文本行。(读取一行数据)
                行的终止符号：通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行
                返回值：包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
使用步骤：
      1.创建字符缓冲输入流对象，构造方法中传递字符输入流
      2.调用字符缓冲输入流对象中的方法read/readLine读取文本
      3.释放资源
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("20_IO\\src\\com\\xjh\\BufferedStream\\b.txt"));

        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }

        br.close();
    }
}
