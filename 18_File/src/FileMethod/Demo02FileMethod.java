package FileMethod;

import java.io.File;

/*
boolean exists()测试此抽象路径名表示的文件或目录是否存在(存在返回true,不存在返回false)
boolean isFile()测试此抽象路径名表示的文件是否是一个标准文件
boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录
 */
public class Demo02FileMethod {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo01(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE");
        System.out.println(f1.exists());//true
    }


    /*
    boolean isFile()测试此抽象路径名表示的文件是否是一个标准文件
        用于判断构造方法中给定的路径是否以文件结尾,是返回true,不是返回false
    boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录
        用于判断构造方法中给定的路径是否以文件夹结尾,是返回true,不是返回false
    使用前提必须保存文件/文件夹存在
     */
    private static void demo02(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE");

        if(f1.exists()){
            System.out.println(f1.isDirectory());//true
            System.out.println(f1.isFile());//false
        }

        File f2 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\动态SQL.pptx");

        if(f2.exists()){
            System.out.println(f2.isDirectory());//false
            System.out.println(f2.isFile());//true
        }
    }
}
