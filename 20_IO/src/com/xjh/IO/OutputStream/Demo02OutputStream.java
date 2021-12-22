package com.xjh.IO.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
一次写入多个字节的方法:
    public void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流
    public void write(byte[] b, int off, int len)将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("20_IO\\src\\com\\xjh\\b.txt"));
        /*
        public void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流
        如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
        如果写的第一个字节是负数,那么第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认表(GBK)
         */
        byte[] bytes = {65,66,67,68,69};//写了五个字节
//        byte[] bytes = {-65,-66,-67,68,69};//烤紻E
        fos.write(bytes);//ABCDE
        /*
        public void write(byte[] b, int off, int len):把字节数组的一部分写入到文件中
        int off:数组的开始索引     int len:写几个字节
         */
        fos.write(bytes,1,2);//BC
        /*
        写入字符的方法:可以使用String类中的方法把字符串转换为字节数组
                byte[] getByte()把字符串转换为字节数组
         */
//        byte[] bytes1 = "100".getBytes();
//        System.out.println(Arrays.toString(bytes1));//[49, 48, 48]

        String s = "你好";
        byte[] bytes1 = s.getBytes();
//        System.out.println(Arrays.toString(bytes1));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes1);

        fos.close();
    }
}
