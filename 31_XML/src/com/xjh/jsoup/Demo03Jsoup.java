package com.xjh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup对象2:Document:文档对象。代表内存中的dom树
 * 获取Element对象
 *      getElementById(Sting id):根据id属性值获取唯一的element对象
 *      getElementsByTag(Sting tagName):根据标签名称获取元素对象集合
 *      getElementsByAttribute(Sting key):根据属性名称获取元素对象集合
 *      getElementByAttributeValue(Sting key,String value):根据对应的属性名和属性值获取元素对象集合
 */
public class Demo03Jsoup {
    public static void main(String[] args) throws IOException {
        String path = Demo03Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        //获取id为uname的元素对象
        Element element_name = document.getElementById("uname");
        System.out.println(element_name);

        System.out.println("----------------------");
        //获取所有的student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("-------------------");
        //获取属性名为id的元素对象们
        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);

        System.out.println("---------------------");
        //获取属性名为number，属性值为s1的对象
        Elements elements_val = document.getElementsByAttributeValue("number", "s1");
        System.out.println(elements_val);
    }
}
