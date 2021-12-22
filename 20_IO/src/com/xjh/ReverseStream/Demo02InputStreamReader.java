package com.xjh.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
java.io.InputStreamReader extends Reader
InputStreamReader:是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符
                        (解码：把看不懂的变成能看懂的)
构造方法：
    InputStreamReader(InputStream in)创建一个使用默认字符集的
    InputStreamReader(InputStream in, String charsetName)创建使用指定字符集的 InputStreamReader
使用步骤：
    1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表
    2.使用InputStreamReader对象中的方法read读取文件
    3.释放资源
注意事项：
        构造方法中指定的编码表要和读取的文件的编码相同，否则会发生乱码
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Test\\gbk.txt"),"GBK");
        int len = 0;
        while ((len = isr.read())!= -1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
