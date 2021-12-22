package com.xjh.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
转换流
java.io.OutputStreamWriter extends Writer
OutputStreamWriter：是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节
                            (编码：把能看懂的变成看不懂的)
构造方法：
   OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter
   OutputStreamWriter(OutputStream out, String charsetName)创建使用指定字符集的 OutputStreamWriter
   参数：
        OutputStream：字节输出流，用来写转换之后的字节到文件中
        String charsetName：指定的编码表名称，不区分大小写
使用步骤：
     1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表
     2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中(编码)
     3.释放资源
 */
public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException{
        write_utf_8();
        write_gbk();
    }

    //使用转换流OutputStreamWriter写utf-8格式的文件
    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Test\\utf_8.txt"),"UTF-8");
        osw.write("你好");
        osw.close();
    }

    //使用转换流OutputStreamWriter写GBK格式的文件
    private static void write_gbk() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Test\\gbk.txt"),"GBK");
        osw.write("你好");
        osw.close();
    }
}
