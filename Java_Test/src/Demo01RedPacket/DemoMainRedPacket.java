package Demo01RedPacket;

import java.util.ArrayList;

//发红包案例
public class DemoMainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("=============");

        //群主发20，分三份
        ArrayList<Integer> redList = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();//100-20
        //6,6,8，随机分三个人
        one.show();
        two.show();
        three.show();
    }

}
