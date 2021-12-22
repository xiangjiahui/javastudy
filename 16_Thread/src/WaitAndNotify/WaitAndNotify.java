package WaitAndNotify;
/*
等待唤醒案例：线程之间的通信
Object类中的方法:
void wait()在其它线程调用此对象的notify方法或notifyALl()方法前,导致当前线程等待
void notify()唤醒在此对象监视器上等待的单个线程,会继续执行wait方法之后的代码
void notifyAll()唤醒所有的等待线程
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象,保证唯一
        Object obj = new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("告知老板要的包子种类和数量");
                        //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了,开吃！");
                        System.out.println("===========================");
                    }
                }
            }
        }.start();

        //创建一个老板线程(生产者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5秒钟之后做好了包子,告知顾客,可以吃包子了！");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
