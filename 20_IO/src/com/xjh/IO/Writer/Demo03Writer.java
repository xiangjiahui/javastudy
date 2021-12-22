package com.xjh.IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
追加/续写的方法:
    FileWriter(String fileName, boolean append)
    FileWriter(File file, boolean append)
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("HelloWorld!"+i+"\r\n");
        }

        fw.close();
    }
}
