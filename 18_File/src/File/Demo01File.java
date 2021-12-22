package File;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//文件分隔符
        System.out.println(pathSeparator);//;

        String separator = File.separator;
        System.out.println(separator);

        demo01();
        demo02("c:\\","a.java");
        demo03();
    }

    /*构造方法1
    File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
    参数：
        String pathname：字符串的路径名称
        路径可以是以文件结尾,也可以是以文件夹结尾
        路径可以说相对路径,也可以是绝对路径
        路径可以说是存在,也可以是不存在
        创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     */
    private static void demo01(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\Java EE\\Java");
        System.out.println(f1);

        File f2 = new File("a.java");
        System.out.println(f2);
    }

    /*
    构造方法2
    File(String parent,String child)根据parent路径名字符串和child路径名字符串创建一个新File实例
    参数：把路径分成了两部分
        String parent：父路径
        String child：子路径
    好处：父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
     */
    private static void demo02(String parent,String child){
        File file = new File(parent,child);
        System.out.println(file);
    }

    /*
    构造方法3
     File(File parent,String child)根据parent路径名字符串和child路径名字符串创建一个新File实例
    参数：把路径分成了两部分
        String parent：父路径
        String child：子路径
    好处：父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
         父类是File类型,可以使用File的方法对路径进行一些操作,在使用路径创建对象
     */
    private static void demo03(){
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);
    }
}
