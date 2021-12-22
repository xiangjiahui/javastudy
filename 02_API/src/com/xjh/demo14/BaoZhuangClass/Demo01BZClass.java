package com.xjh.demo14.BaoZhuangClass;
/*
包装类：使用一个类将基本类型的数据包装起来，在类中定义一些方法，这个类叫做包装类。可使用这个类的方法操作基本类型的数据
装箱：把基本类型的数据包装到类中（基本类型-->包装类）
    构造方法：
        Integer(int value)构造一个新分配的Integer对象，它表示指定的int值
        Integer（String s）构造一个新分配的Integer对象，它表示String参数所指示的int值
                传递的字符串，必须是基本类型的字符串，否则会抛出异常."100"正确，"a"抛出异常
拆箱：在包装类中取出基本类型的数据（包装类-->基本类型的数据）
    成员方法：int intValue():以int类型返回该Integer的值。
 */
public class Demo01BZClass {
    public static void main(String[] args) {
        //构造方法
        Integer in1 = new Integer(1);//横线代表已过时
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3= Integer.valueOf(1);//返回一个表示指定的int值的Integer实例。
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");//返回一个表示指定的String值的Integer对象。
        System.out.println(in4);

        int i = in1.intValue();
        System.out.println(i);
    }
}
