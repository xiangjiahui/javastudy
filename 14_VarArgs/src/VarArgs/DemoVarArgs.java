package VarArgs;
/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提:当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数
    使用格式：定义方法时使用
        修饰符  返回值类型  方法名(数据类型...变量名){}
   可变参数的原理：可变参数底层是一个数组,根据传递参数的个数不同,会创建不同长度的数组,来存储这些参数
 */
public class DemoVarArgs {
    public static void main(String[] args) {
        int a = sum(10, 20, 30,40, 50);
        System.out.println(a);
    }

    /*
        定义一个计算(0-n)整数和的方法
        已知：计算整数的和，数据类型已经确定int
     */
    public static int sum(int...arr){
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中的每一个数
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /*
        可变参数注意事项：
                1.一个方法的参数列表，只能有一个可变参数
                2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     */
//    public static void method(int...arr,String...s){}错误，只能有一个可变参数
//    public static void method(int a,String s,double d,int...arr){}正确
    //可变参数的特殊(终极)写法:    public static void method(Object...obj){}
}
