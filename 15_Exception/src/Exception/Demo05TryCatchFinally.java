package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05TryCatchFinally {
    public static void main(String[] args){
        try{
            //可能会产生异常的代码
            readFile("c:\\a.txt");
        }catch (IOException e){
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            //无论是否存在异常，都会执行
            System.out.println("资源释放");
        }
    }
    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件的路径不是c.\\txt");
        }

        System.out.println("路径没有问题,可以读取文件");
    }
}
