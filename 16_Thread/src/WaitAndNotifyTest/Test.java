package WaitAndNotifyTest;
/*
测试类：
包含main方法
创建包子对象
创建包子铺线程,开启,生产包子
创建吃货线程,开启,吃包子
 */
public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
