package com.xjh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 *选择器查询
 */
public class Demo05Jsoup {
    public static void main(String[] args) throws IOException {
        String path = Demo05Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        Elements name = document.select("name");
        System.out.println(name);

        System.out.println("------------------");

        Elements elements = document.select("#uname");
        System.out.println(elements);

        System.out.println("--------------------");
        //获取student标签并且number属性值s1的age的子标签
        Elements sel_age = document.select("student[number='s1'] > age");
        System.out.println(sel_age);
    }
}
