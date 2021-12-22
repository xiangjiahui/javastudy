package com.xjh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup快速入门
 * Jsoup是用来解析xml和html文档的
 */
public class Demo01Jsoup {
    public static void main(String[] args) throws IOException {
        //1.导入Jsoup jar包
        //2.1获取Document对象,根据xml文档获取
        String path = Demo01Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文档,加载文档进内存,获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //3.获取元素对象Element
        Elements elements = document.getElementsByTag("name");
//        System.out.println(elements.size());
        //3.1获取第一个name的Element对象
        Element element = elements.get(0);
        String name = element.text();
        System.out.println(name);
    }
}
