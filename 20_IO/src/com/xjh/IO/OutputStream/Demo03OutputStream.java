package com.xjh.IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
追加写/续写的方法：使用两个参数的构造方法
    FileOutputStream(File file, boolean append)创建一个向指定 File 对象表示的文件中写入数据的文件输出流
    FileOutputStream(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流
        参数append:追加写开关:
            true:创建对象不会覆盖源文件,继续在文件的末尾续写数据
            false:创建一个新文件,覆盖源文件
        写换行:写换行符号
            windows:\r\n  linux:/n  mac:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("20_IO\\src\\com\\xjh\\c.txt",true);
        for (int i = 0; i <= 10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
