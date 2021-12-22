package com.xjh.IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

//使用TryCatch处理异常
public class Demo04TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld!"+i+"\r\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
