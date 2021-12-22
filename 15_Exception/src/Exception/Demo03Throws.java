package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03Throws {
    /*
        FileNotFoundException extends IOException extends Exception
        如果声明的多个异常有子父类关系,只要声明父类即可
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        readFile("d.\\a.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException,IOException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件的路径不是c.\\txt");
        }

        if(fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名错误");
        }
    }
}
