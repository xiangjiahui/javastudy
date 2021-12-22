package com.xjh.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
java.io.PrintStream extends OutputStream:打印流
    PrintStream为其它输出流添加了功能，使它们能够方便地打印各种数据值表示形式
特点：
    1.只负责数据的输出，不负责数据的读取
    2.与其它输出流不同，打印流永远不会抛出IOException
    3.有特有的方法：void print(任意类型的值)
                   void println(任意类型的值并换行)
构造方法：
        PrintStream(File file):输出的目的地是一个文件
        PrintStream(OutputStream out):输出的目的地是一个字节流
        PrintStream(String fileName):输出的目的地是一个文件路径
注意：如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表(97->a)
     如果使用自己特有的方法print/println方法写数据，写的数据原样输出(97->97)
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("E:\\Study\\20_IO\\src\\com\\xjh\\PrintStream\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
