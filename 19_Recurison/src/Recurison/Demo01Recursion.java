package Recurison;

import java.io.File;

/*
递归：自己调用自己
递归的分类：
        1.直接递归：方法自身调用自己
        2.间接递归：A方法调用B方法,B方法调用A方法
注意事项：
        1.递归一定要有限定条件,保证递归能够停下来,否则会发生栈内存溢出
        2.在递归中虽然有限定条件,但是递归次数不能过多,否则也会发生栈内存溢出
        3.构造方法,禁止递归
递归使用的前提：
        当调用的方法的时候,方法的主体不变,每次调用方法的参数不同,可以使用递归
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);

        int factorial = factorial(4);
        System.out.println(factorial);

        File file = new File("C:\\Study");
        printFile(file);
    }

    /*
    定义一个方法,计算1-n之间的和
    结束递归的条件：获取到1的时候结束
    递归的目的：获取到下一个被加的数字(n-1)
    */
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    //定义一个方法计算n的阶乘
    public static int factorial(int s){
        if(s == 1){
            return 1;
        }
        return s * factorial(s-1);
    }

    /*
    定义一个方法,参数传递File类型的目录
    方法中对目录进行遍历
     */
    public static void printFile(File dir){
        System.out.println(dir);//打印被遍历的目录的名称
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                //如果file是一个文件夹，则继续遍历这个文件夹
                //发现printFile方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用方法即可：递归
                printFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
