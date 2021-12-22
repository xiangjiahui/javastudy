package Inner01;
/*
如果接口的实现类（或是父类的子类）只需要使用唯一的一次。
这种情况下可省略掉改类的定义，而改为使用【匿名内部类】,不使用实现类，直接使用接口。
匿名内部类定义格式：
接口名称 对象名 = new 接口名称（）{
    //覆盖重写【所有抽象方法】
};
【注意】：
1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，就必须使用单独定义的实现类。
2.匿名对象，在【调用方法】的时候，只能调用唯一一次。
如果希望同一个对象，调用多次方法，就必须给对象起个名字
3，匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】。
 */
public class DemoMain {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();

        System.out.println("——————————————————————");

        //使用匿名内部类写法
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

        System.out.println("——————————————————————");

        new MyInterface(){
          @Override
          public void method(){
              System.out.println("匿名内部类实现了方法");
          }
        }.method();
    }
}
