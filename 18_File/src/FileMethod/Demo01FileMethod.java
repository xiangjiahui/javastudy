package FileMethod;

import java.io.File;

/*
public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
public String getName()返回由此抽象路径名表示的文件或目录的名称
public String getPath()将此抽象路径名转换为一个路径名字符串
public long length() 返回由此抽象路径名表示的文件的长度
 */
public class Demo01FileMethod {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /*
    public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
    无论路径是绝对的还是相对的,此方法返回的都是绝对路径
     */
    private static void demo01(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE");
        System.out.println(f1.getAbsolutePath());//C:\Users\DELL\Desktop\Java EE

        File f2 = new File("a.txt");
        System.out.println(f2.getAbsolutePath());//E:\Study\a.txt
    }

    /*
    public String getPath()将此抽象路径名转换为一个路径名字符串。
    相对路径就返回相对路径,绝对路径就返回绝对路径
     */
    private static void demo02(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE");
        System.out.println(f1.getPath());//C:\Users\DELL\Desktop\Java EE

        File f2 = new File("a.txt");
        System.out.println(f2.getPath());//a.txt
    }

    /*
    public String getName()返回由此抽象路径名表示的文件或目录的名称
    获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void demo03(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE");
        System.out.println(f1.getName());//Java EE
    }

    /*
    public long length() 返回由此抽象路径名表示的文件的长度
    获取的是构造方法指定的文件的大小,以字节为单位
    文件夹是没有大小概念的,不能获取文件夹的大小
    如果构造方法中给出的路径不存在,那么length方法返回0
     */
    private static void demo04(){
        File file = new File("C:\\Users\\DELL\\Desktop\\Java EE\\动态SQL.pptx");
        System.out.println(file.length());//925406

        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\1.jpg");
        System.out.println(f1.length());//0

        File f2 = new File("C:\\Program Files\\2345Soft");
        System.out.println(f2.length());//0
    }
}
