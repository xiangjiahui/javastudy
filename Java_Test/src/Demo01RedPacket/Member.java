package Demo01RedPacket;

import java.util.ArrayList;
import java.util.Random;
//普通成员类
public class Member extends User{

    public Member(){
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随机抽取一个给自己
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包给自己
        int delta = list.remove(index);
        //当前成员自己本来的金额
        int money = super.getMoney();
        //加法，并且重新设置回去
        super.setMoney(money + delta);
    }
}
