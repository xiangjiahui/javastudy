package FileMethod;

import java.io.File;
import java.io.IOException;

/*
boolean mkdir()创建此抽象路径名指定的目录
boolean mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录
boolean createNewFile()当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
boolean delete()删除此抽象路径名表示的文件或目录
 */
public class Demo03FileCreateAndDelete {
    public static void main(String[] args) throws IOException {
//        demo01();
//        demo2();
        demo03();
    }

    /*
  boolean createNewFile()当且仅当具有该名称的文件不存在时，创建一个新的空文件
  true：文件不存在,创建文件,返回true
  false：文件存在,不会创建,返回false
  注意：
        1.此方法只能创建文件,不能创建文件夹
        2.创建文件的路径必须存在,否则会抛出异常
     */
    private static void demo01() throws IOException {
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:"+b1);

        File f2 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\1.java");
        boolean b2 = f2.createNewFile();
        System.out.println("b2:"+b2);
    }

    /*
    boolean mkdir()创建单级文件夹
    boolean mkdirs()既可以创建单级文件夹,也可以创建多级文件夹
    true：文件夹不存在,创建文件夹,返回true
    false：文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
    注意：
        1.此方法只能创建文件夹
        2.路径不存在,不会创建
     */
    private static void demo2(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\MyJava");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);

        File f2 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\MyJava\\Java\\My");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:"+b2);

       File f3 = new File("C:\\Users\\DEll\\Desktop\\Java EE\\My.txt");
       boolean b3 = f3.mkdirs();
       System.out.println("b3:"+b3);//true,看类型,此方法创建的都是文件
    }

    /*
    boolean delete()删除此抽象路径名表示的文件或目录
    此方法可以删除构造方法路径中给出的文件/文件夹
    true：文件/文件夹删除成功,返回true
    false：文件夹中有内容,不会删除,返回false;构造方法中路径不存在返回false
    注意：delete方法是直接在硬盘删除文件/文件夹,不走回收站
     */
    private static void demo03(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\MyJava\\Java");
        System.out.println(f1.delete());
    }
}
