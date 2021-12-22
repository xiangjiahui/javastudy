package Inner;
/*
内部类：一个类内部包含另一个类。（例如身体与心脏的关系，汽车与发动机的关系）
分类；1.成员内部类      2.局部内部类(定义在一个方法内部的类)
成员内部类定义格式：
public class 外部类名称{
    public class 内部类名称{
        //....
    }
}
局部内部类定义格式：
public class 外部类名称{
    public void 方法名称（）{
        class 局部内部类名称{  //..    }
    }
}
 */
public class Demo01InnerClass {

    public static void main(String[] args) {
        //间接访问内部类方法
        Body body = new Body();
        body.methodBody();

        System.out.println("——————————————————————");

        //直接访问内部类方法
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        heart.showNumber();

        System.out.println("——————————————————————");

        //访问局部内部类方法
        Outer outer = new Outer();
        outer.methodOuter();
    }
}
