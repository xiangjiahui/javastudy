package com.xjh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup对象3:Element:元素对象
 * 获取子元素对象
 *      getElementById(Sting id):根据id属性值获取唯一的element对象
 *      getElementsByTag(Sting tagName):根据标签名称获取元素对象集合
 *      getElementsByAttribute(Sting key):根据属性名称获取元素对象集合
 *      getElementByAttributeValue(Sting key,String value):根据对应的属性名和属性值获取元素对象集合
 * 获取属性值
 *      String attr(String key):根据属性名称获取属性值
 * 获取文本内容
 *      String text():获取纯文本内容
 *      String html():获取标签体的所有内容(包括子标签的标签和文本内容)。也可说是获取标签的innerHTML
 */
public class Demo04Jsoup {
    public static void main(String[] args) throws IOException {
        String path = Demo04Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");


        Element uname = document.getElementById("uname");
        Element ele_name = uname.getElementById("uname");
        System.out.println(ele_name);

        System.out.println("-----------------");
        Elements number = document.getElementsByAttribute("number");
        String attr_num = number.attr("number");
        System.out.println(attr_num);

    }
}
