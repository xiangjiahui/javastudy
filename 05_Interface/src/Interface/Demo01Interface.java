package Interface;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的抽象方法。
接口中包含的内容有：
1.常量（java 7）
2.抽象方法
3.静态方法（java 8）
4.默认方法
5.私有方法（java 9）
 */
public class Demo01Interface {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.eat();
        impl.methodDefault1();
        //接口的静态方法不能通过实现类调用，而是通过接口直接调用
        MyInterface.methodAbs();
        System.out.println(impl.NUM_MY_CLASS);
    }
}
