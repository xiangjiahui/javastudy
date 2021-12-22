package com.xjh.DemoTest;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/*
练习：对文本的内容进行排序
     按照(1,2,3,4....)顺序排序
分析：
    1.创建一个HashMap集合对象，key：存储每行文本的序号;value：存储每行的文本
    2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
    3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
    4.使用字符缓冲输入流中的方法readLine逐行读取文本
    5.对读取到的文本进行切割，获取行中的序号和文本内容
    6.把切割好的序号和文本内容存储到HashMap集合中
    7.遍历HashMap集合，获取每一个键值对
    8.把每一个键值对拼接为一个文本行
    9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
    10.释放资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException {
        //1.创建一个HashMap集合对象，key：存储每行文本的序号;value：存储每行的文本
        HashMap<String,String> map = new HashMap<>();
        //2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("E:\\Study\\20_IO\\src\\com\\xjh\\DemoTest\\in.txt"));
        //3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Study\\20_IO\\src\\com\\xjh\\DemoTest\\out.txt"));
        //4.使用字符缓冲输入流中的方法readLine逐行读取文本
        String line;
        while ((line = br.readLine())!=null){
            //5.对读取到的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            //6.把切割好的序号和文本内容存储到HashMap集合中
            map.put(arr[0],arr[arr.length-1]);
        }

        //7.遍历HashMap集合，获取每一个键值对
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            //8.把每一个键值对拼接为一个文本行
            line = key + "." + value;
            //9.把拼接好的文本，使用字符缓冲输出流中方法write写入到文件中
            bw.write(line);
            bw.newLine();
        }

        //10.释放资源
        bw.close();
        br.close();
    }
}
