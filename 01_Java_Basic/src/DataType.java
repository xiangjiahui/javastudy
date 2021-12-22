/*
自动类型转换（隐式）
    1.特点：代码不需要进行特殊处理，自动完成。
    2.规则：数据范围从小到大。(右小左大)

强制类型转换（显式）
    1.特点：代码需要进行特殊处理，不能自动完成
    2.格式：范围小的类型  变量名 = （范围小的类型） 原本的范围类型

【注意事项】：
    1.强制类型转换一般不推荐使用，会发生精度损失，数据溢出。
    2.byte/short/char三种类型可以发生数学运算。
    3.byte/short/char三种类型运算时，首先会被提升成为int类型，然后在计算
 */

public class DataType {     //数据类型转换
    public static void main(String[] args) {
        //左边是long类型，而右边是int类型。发生了自动转换。
        //int--->long
        long num = 123;

        //float--->double
        double num1 = 2.5F;

        //long--->float
        float num2 = 30L;

        //强制转换  long---->int,不是从小到大，不能转换
//        int a = 100L;
        int a = (int) 100L;

        int b = (int) 10000000000000L;
        System.out.println(b);      //1316134912  数据溢出

        int c = (int)3.1415;
        System.out.println(c);      //所有的小数位全部舍弃

        char zifu = 'A';
        System.out.println(zifu+1);     //66  A被当作65来处理
        byte num3 = 40;     //右侧数值不能超过左边数据范围
        byte num4 = 50;
//      byte result = num3 + num4;   byte+byte-->int+int-->int
        int result = num3 + num4;

    }
}
