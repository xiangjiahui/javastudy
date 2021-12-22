package Inner;

//成员内部类
public class Body {     //外部类

    String name;
    int num = 10;   //外部类变量

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public class Heart {    //内部类

        int num = 20;       //内部类变量

        public void beat(){
            System.out.println("内部类方法");
            System.out.println("心脏蹦蹦跳");
            System.out.println("我叫："+name);
        }

        //内部类重名变量的访问
        public void showNumber(){
            int num = 30;   //内部类方法的局部变量
            System.out.println(num);    //局部变量30，就近原则
            System.out.println(this.num);   //内部类变量20

            //访问外部类变量的方法： 外部类名称.this.变量名
            System.out.println(Body.this.num);  //外部类变量,10
        }
    }
}
