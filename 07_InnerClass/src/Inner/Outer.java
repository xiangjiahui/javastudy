package Inner;

/*
局部内部类--"局部"：只有当前所属的方法才能使用它，出了方法便不能使用了
定义一个类的时候，权限修饰符规则：
1.外部类：public / (default)
2.成员内部类：public / protected / (default) / private
3.局部内部类：什么都不能写
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。
 */
public class Outer {

    public void methodOuter(){
        final int num = 20;

        class Inner{    //局部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);    //10
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
