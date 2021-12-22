package Extends;
/*
重写（Override）：在继承关系当中，方法的名称一样，参数列表【也一样】。也可叫覆盖，覆写。
特点：创建的是子类对象，则优先使用子类的方法。
【注意事项】：1.必须保证父子类之间的名称相同，参数列表也相同。
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写。就算不写，只要满足要求也是正确的方法覆盖重写。
2.子类方法的返回值（void，string等）必须【小于等于】父类方法【返回值】范围。（String返回值 < Object返回值）
Object类是所有类的公共最高父类,string是object的子类
3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
扩展：public > protected > (default) > private
备注：(default)不是关键字default，而是什么都不写，留空。
设计原则：对于已经投入使用的类，尽量不要进行修改。定义一个新的类，来重复利用其中共性内容，并且添加改动新内容。
 */
public class Demo02Override {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.send();
        p.show();
        System.out.println("===============");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
