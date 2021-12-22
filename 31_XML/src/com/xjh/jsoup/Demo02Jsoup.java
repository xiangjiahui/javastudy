package com.xjh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup对象1:Jsoup:工具类,可以解析html或xml文档,返回Document
 */
public class Demo02Jsoup {
    public static void main(String[] args) throws IOException {
        String path = Demo02Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        //parse(Fine in,String charsetName)
        Document document = Jsoup.parse(new File(path), "UTF-8");
//        System.out.println(document);

        //parse(URL url,int timeoutMillis):通过网络路径获取指定的html或者xml文档对象
        URL url = new URL("https://www.icourse163.org/");
        Document document1 = Jsoup.parse(url,3000);
        System.out.println(document1);//获取出来的是页面具体的html文档
    }
}
