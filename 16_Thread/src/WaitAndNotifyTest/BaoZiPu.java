package WaitAndNotifyTest;
/*
包子铺类,是一个线程类,可以继承Thread
设置线程任务:生产包子
对包子的状态进行判断
true:有包子
    包子铺调用wait方法进入等待状态
false:没有包子
    包子铺生产包子
    交替生产两种包子(i%2==0)
    包子铺生产好了包子
    修改包子的状态为true有
    唤醒吃货线程,让吃货线程吃包子
 */
public class BaoZiPu extends Thread{
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //使用使用带构造参数方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务,生产包子
    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if (bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(count%2 == 0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产："+bz.pi+bz.xian+"包子");
                //生产包子需要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产好了包子,修改包子的状态为true有
                bz.flag = true;
                //唤醒吃货线程,让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺已经生产好了："+bz.pi+bz.xian+"包子,吃货可以开始吃了");
            }
        }

    }
}
