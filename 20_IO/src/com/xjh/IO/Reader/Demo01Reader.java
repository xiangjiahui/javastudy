package com.xjh.IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
java.io.Reader:用于读取字符流的抽象类
共性的成员方法:
    int read()读取单个字符
    int read(char[] cbuf)将字符读入数组
    abstract  void close()关闭该流并释放与之关联的所有资源
java.io.FileReader extends InputStreamReader extends Reader
FileReader：文件字符输入流
     作用：把硬盘中文件中的数据以字符的方式读取到内存中
构造方法：
    FileReader(File file)在给定从中读取数据的 File 的情况下创建一个新 FileReader。
    FileReader(String fileName)在给定从中读取数据的文件名的情况下创建一个新 FileReader。
参数：读取文件的数据源
        String fileName：文件的路径
        File file：一个文件
FileReader构造方法的作用：
                    1.会创建一个FileReader对象
                    2.会把FileReader对象指向要读取的文件
字符输入流的使用步骤:
                1.创建一个FileReader对象,构造方法中绑定要读取的数据源
                2.使用FileReader对象中的方法read,读取文件
                3.释放资源
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Study\\20_IO\\src\\com\\xjh\\b.txt");
/*        int len = 0;
        while ((len = fr.read())!= -1){
            System.out.print((char) len);
        }
        fr.close();*/

        char[] c = new char[1024];//存储读取到的多个字节
        int len = 0;//记录的是每次读取的有效字节个数
        while ((len = fr.read(c))!= -1){
            /*
    String类的构造方法:
    String(char[] c):把字节数组转换为字符串
    String(char[] c,int offset,int length)把字节数组的一部分转换为字符串。ffset:数组开始的索引,length:转换的字节个数
             */
            System.out.println(new String(c,0,len));
        }
        fr.close();
    }
}
